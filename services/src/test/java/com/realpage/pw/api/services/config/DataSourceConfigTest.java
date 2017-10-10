package com.xyz.pw.api.services.config;

import static org.assertj.core.api.Assertions.assertThat;

import com.zaxxer.hikari.HikariDataSource;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.util.EnvironmentTestUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ReflectionUtils;

public class DataSourceConfigTest {

  private static final String PREFIX = "spring.datasource.hikari.";

  private final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

  @Test
  public void testDataSourceExists() throws Exception {
    this.context.register(HikariDataSourceConfiguration.class);
    this.context.refresh();
    assertThat(this.context.getBean(DataSource.class)).isNotNull();
    assertThat(this.context.getBean(HikariDataSource.class)).isNotNull();
  }

  @Test
  public void testDataSourcePropertiesOverridden() throws Exception {
    this.context.register(HikariDataSourceConfiguration.class);
    EnvironmentTestUtils.addEnvironment(this.context, PREFIX + "jdbcUrl:jdbc:foo//bar/spam");
    EnvironmentTestUtils.addEnvironment(this.context, PREFIX + "maxLifetime:1234");
    this.context.refresh();
    HikariDataSource ds = this.context.getBean(HikariDataSource.class);
    assertThat(ds.getJdbcUrl()).isEqualTo("jdbc:foo//bar/spam");
    assertThat(ds.getMaxLifetime()).isEqualTo(1234);
  }

  @Test
  public void testDataSourceGenericPropertiesOverridden() throws Exception {
    this.context.register(HikariDataSourceConfiguration.class);
    EnvironmentTestUtils.addEnvironment(this.context, PREFIX + "dataSourceProperties.dataSourceClassName:org.h2.JDBCDataSource");
    this.context.refresh();
    HikariDataSource ds = this.context.getBean(HikariDataSource.class);
    assertThat(ds.getDataSourceProperties().getProperty("dataSourceClassName")).isEqualTo("org.h2.JDBCDataSource");
  }

  @Test
  public void testDataSourceDefaultsPreserved() throws Exception {
    this.context.register(HikariDataSourceConfiguration.class);
    this.context.refresh();
    HikariDataSource ds = this.context.getBean(HikariDataSource.class);
    assertThat(ds.getMaxLifetime()).isEqualTo(1800000);
  }

  @SuppressWarnings("unchecked")
  public static <T> T getField(Class<?> target, String name) {
    Field field = ReflectionUtils.findField(target, name, null);
    ReflectionUtils.makeAccessible(field);
    return (T) ReflectionUtils.getField(field, target);
  }

  @Configuration
  @EnableConfigurationProperties
  protected static class HikariDataSourceConfiguration {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource dataSource() {
      return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

  }

}
