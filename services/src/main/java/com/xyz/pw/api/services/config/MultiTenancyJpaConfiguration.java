package com.xyz.pw.api.services.config;

import java.sql.SQLException;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.MultiTenancyStrategy;
import org.hibernate.cfg.Environment;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.hibernate.engine.jdbc.connections.spi.MultiTenantConnectionProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
@EnableConfigurationProperties(JpaProperties.class)
public class MultiTenancyJpaConfiguration {

  @Autowired
  private DataSource dataSource;

  @Autowired
  private JpaProperties jpaProperties;

  @Autowired
  private MultiTenantConnectionProvider multiTenantConnectionProvider;

  @Autowired
  private CurrentTenantIdentifierResolver currentTenantIdentifierResolver;

  @Autowired
  private DataSourceConfig dataSourceConfig;


  /**
   * Control entity manager.
   *
   * @return the local container entity manager factory bean
   * @throws SQLException the SQL exception
   */
  @Primary
  @Bean(name = "entityManagerFactory")
  public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws SQLException {
    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    em.setDataSource(dataSource);
    em.setPackagesToScan(new String[] {"com.xyz.pw.api.data.model.common"});

    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    em.setJpaVendorAdapter(vendorAdapter);

    Properties properties = new Properties();
    properties.put(Environment.MULTI_TENANT, MultiTenancyStrategy.DATABASE);
    properties.put(Environment.MULTI_TENANT_CONNECTION_PROVIDER, multiTenantConnectionProvider);
    properties.put(Environment.MULTI_TENANT_IDENTIFIER_RESOLVER, currentTenantIdentifierResolver);
    properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
    properties.putAll(jpaProperties.getHibernateProperties(dataSource));

    em.setJpaProperties(properties);
    return em;
  }

  /**
   * Control entity manager.
   *
   * @return the local container entity manager factory bean
   * @throws SQLException the SQL exception
   */
  @Bean(name = "controlEntityManager")
  public LocalContainerEntityManagerFactoryBean controlEntityManager() throws SQLException {
    LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
    em.setDataSource(dataSourceConfig.datasourceCONTROL());
    em.setPackagesToScan(new String[] {"com.xyz.pw.api.data.model.control"});
    // em.setPersistenceUnitName("control");//
    HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
    em.setJpaVendorAdapter(vendorAdapter);
    return em;
  }

  /**
   * Entity control factory. Avoids issue with proxy returned from controlEntityManager
   *
   * @return the entity manager
   * @throws SQLException the SQL exception
   */
  @Bean
  public EntityManager entityControlFactory() throws SQLException {
    return controlEntityManager().getNativeEntityManagerFactory().createEntityManager();
  }

  @Bean
  @Qualifier(value = "jpaTransactionManager")
  public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
    return new JpaTransactionManager(emf);
  }
}
