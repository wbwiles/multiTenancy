package com.xyz.pw.api.services.config;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;


public class MultiTenancyJpaConfigurationTest {
  @InjectMocks
  private MultiTenancyJpaConfiguration multiTenancyJpaConfiguration;
  @Mock
  private DataSourceConfig mockDataSourceConfig;
  @Mock
  private JpaProperties jpaProperties;

  @Mock
  private EntityManagerFactoryBuilder mockEntityManagerFactoryBuilder;
  @Mock
  private DataSource mockDataSource;


  @Before
  public void init() {
    MockitoAnnotations.initMocks(this);
    Mockito.when(mockDataSourceConfig.datasourceCONTROL()).thenReturn(mockDataSource);
    Mockito.when(mockEntityManagerFactoryBuilder.dataSource(mockDataSource)).thenThrow(new RuntimeException("can't mock this"));
  }

  @Test(expected = RuntimeException.class)
  public void testEntityManagerFactory() throws SQLException {
    multiTenancyJpaConfiguration.entityManagerFactory();

  }

  @Test
  public void testControlEntityManager() throws SQLException {
    multiTenancyJpaConfiguration.controlEntityManager();
  }



  @Test(expected = NullPointerException.class)
  public void testEntityControlFactory() throws SQLException {
    multiTenancyJpaConfiguration.entityControlFactory();
  }

}
