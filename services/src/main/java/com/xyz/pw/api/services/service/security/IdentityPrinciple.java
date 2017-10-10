package com.xyz.pw.api.services.service.security;

public class IdentityPrinciple {
  private final String username;
  private final Long orgId;

  public IdentityPrinciple(String username, Long orgId) {
    this.username = username;
    this.orgId = orgId;
  }

  public String getUsername() {
    return username;
  }

  public Long getOrgId() {
    return orgId;
  }
}
