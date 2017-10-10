package com.xyz.pw.api.services.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {

  @Autowired
  private MultitenancyProperties multitenancyProperties;

  @Bean(name = {"dataSource", "datasourceIREPM"})
  @ConfigurationProperties(prefix = "spring.multitenancy.datasourceIREPM")
  public DataSource datasourceIREPM() {
    DataSourceBuilder factory = DataSourceBuilder.create(this.multitenancyProperties.getdatasourceIREPM().getClassLoader()).driverClassName(this.multitenancyProperties.getdatasourceIREPM().getDriverClassName())
        .username(this.multitenancyProperties.getdatasourceIREPM().getUsername()).password(this.multitenancyProperties.getdatasourceIREPM().getPassword()).url(this.multitenancyProperties.getdatasourceIREPM().getUrl());
    return factory.build();
  }

  @Bean(name = "datasourceCONTROL")
  @ConfigurationProperties(prefix = "spring.multitenancy.datasourceCONTROL")
  public DataSource datasourceCONTROL() {
    DataSourceBuilder factory = DataSourceBuilder.create(this.multitenancyProperties.getdatasourceCONTROL().getClassLoader()).driverClassName(this.multitenancyProperties.getdatasourceCONTROL().getDriverClassName())
        .username(this.multitenancyProperties.getdatasourceCONTROL().getUsername()).password(this.multitenancyProperties.getdatasourceCONTROL().getPassword()).url(this.multitenancyProperties.getdatasourceCONTROL().getUrl());
    return factory.build();
  }

  @Bean(name = "datasourceSHARD4")
  @ConfigurationProperties(prefix = "spring.multitenancy.datasourceSHARD4")
  public DataSource datasourceSHARD4() {
    DataSourceBuilder factory = DataSourceBuilder.create(this.multitenancyProperties.getdatasourceSHARD4().getClassLoader()).driverClassName(this.multitenancyProperties.getdatasourceSHARD4().getDriverClassName())
        .username(this.multitenancyProperties.getdatasourceSHARD4().getUsername()).password(this.multitenancyProperties.getdatasourceSHARD4().getPassword()).url(this.multitenancyProperties.getdatasourceSHARD4().getUrl());
    return factory.build();
  }
}
