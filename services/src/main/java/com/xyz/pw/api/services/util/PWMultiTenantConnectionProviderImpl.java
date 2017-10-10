package com.xyz.pw.api.services.util;

import org.hibernate.engine.jdbc.connections.spi.AbstractDataSourceBasedMultiTenantConnectionProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Component
public class PWMultiTenantConnectionProviderImpl extends AbstractDataSourceBasedMultiTenantConnectionProviderImpl {

  private static final long serialVersionUID = 8168907057647334460L;
  private static final String DEFAULT_TENANT_ID = "tenant_1";

  @Autowired
  private DataSource datasourceIREPM;

  @Autowired
  private DataSource datasourceCONTROL;

  @Autowired
  private DataSource datasourceSHARD4;

  private Map<String, DataSource> map;

  @PostConstruct
  public void load() {
    map = new HashMap<>();
    map.put("tenant_1", datasourceIREPM);
    map.put("tenant_2", datasourceCONTROL);
    map.put("tenant_3", datasourceSHARD4);
  }

  @Override
  protected DataSource selectAnyDataSource() {
    return map.get(DEFAULT_TENANT_ID);
  }

  @Override
  protected DataSource selectDataSource(String tenantIdentifier) {
    return map.get(tenantIdentifier);
  }

  public DataSource getControlDataSource() {
    return datasourceCONTROL;
  }
}
