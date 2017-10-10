package com.xyz.pw.api.services.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties("spring.multitenancy")
@Configuration
public class MultitenancyProperties {

  @NestedConfigurationProperty
  private DataSourceProperties datasourceIREPM;

  @NestedConfigurationProperty
  private DataSourceProperties datasourceCONTROL;

  @NestedConfigurationProperty
  private DataSourceProperties datasourceSHARD4;

  public DataSourceProperties getdatasourceIREPM() {
    return datasourceIREPM;
  }

  public void setdatasourceIREPM(DataSourceProperties datasourceIREPM) {
    this.datasourceIREPM = datasourceIREPM;
  }

  public DataSourceProperties getdatasourceCONTROL() {
    return datasourceCONTROL;
  }

  public void setdatasourceCONTROL(DataSourceProperties datasourceCONTROL) {
    this.datasourceCONTROL = datasourceCONTROL;
  }

  public DataSourceProperties getdatasourceSHARD4() {
    return datasourceSHARD4;
  }

  public void setdatasourceSHARD4(DataSourceProperties datasourceSHARD4) {
    this.datasourceSHARD4 = datasourceSHARD4;
  }

}
