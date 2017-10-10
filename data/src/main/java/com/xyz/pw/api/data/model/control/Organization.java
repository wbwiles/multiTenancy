package com.xyz.pw.api.data.model.control;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the organization database table.
 * 
 */
@Entity
public class Organization implements Serializable {

  private static final long serialVersionUID = -7584602339970662686L;

  @Id
  private String id;

  @Column(name = "allow_immediate_access")
  private byte allowImmediateAccess;

  @Column(name = "company_name")
  private String companyName;

  @Column(name = "connection_id")
  private BigInteger connectionId;

  @Column(name = "created_by")
  private String createdBy;

  @Column(name = "created_by_id")
  private BigInteger createdById;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_date")
  private Date createdDate;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "created_ts")
  private Date createdTs;

  @Column(name = "is_billing_locked")
  private byte isBillingLocked;

  @Column(name = "is_franchise_master")
  private byte isFranchiseMaster;

  @Column(name = "is_property_management_company")
  private byte isPropertyManagementCompany;

  @Column(name = "is_pw_master")
  private byte isPwMaster;

  @Column(name = "maintenance_locked")
  private byte maintenanceLocked;

  @Column(name = "modified_by")
  private String modifiedBy;

  @Column(name = "modified_by_id")
  private BigInteger modifiedById;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "modified_ts")
  private Date modifiedTs;

  @Column(name = "partner_id")
  private BigInteger partnerId;

  @Column(name = "session_timeout")
  private int sessionTimeout;

  @Column(name = "sfdc_account_id")
  private String sfdcAccountId;

  @Column(name = "system_id")
  private BigInteger systemId;

  public Organization() {}

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public byte getAllowImmediateAccess() {
    return this.allowImmediateAccess;
  }

  public void setAllowImmediateAccess(byte allowImmediateAccess) {
    this.allowImmediateAccess = allowImmediateAccess;
  }

  public String getCompanyName() {
    return this.companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public BigInteger getConnectionId() {
    return this.connectionId;
  }

  public void setConnectionId(BigInteger connectionId) {
    this.connectionId = connectionId;
  }

  public String getCreatedBy() {
    return this.createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public BigInteger getCreatedById() {
    return this.createdById;
  }

  public void setCreatedById(BigInteger createdById) {
    this.createdById = createdById;
  }

  public Date getCreatedDate() {
    return this.createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  public Date getCreatedTs() {
    return this.createdTs;
  }

  public void setCreatedTs(Date createdTs) {
    this.createdTs = createdTs;
  }

  public byte getIsBillingLocked() {
    return this.isBillingLocked;
  }

  public void setIsBillingLocked(byte isBillingLocked) {
    this.isBillingLocked = isBillingLocked;
  }

  public byte getIsFranchiseMaster() {
    return this.isFranchiseMaster;
  }

  public void setIsFranchiseMaster(byte isFranchiseMaster) {
    this.isFranchiseMaster = isFranchiseMaster;
  }

  public byte getIsPropertyManagementCompany() {
    return this.isPropertyManagementCompany;
  }

  public void setIsPropertyManagementCompany(byte isPropertyManagementCompany) {
    this.isPropertyManagementCompany = isPropertyManagementCompany;
  }

  public byte getIsPwMaster() {
    return this.isPwMaster;
  }

  public void setIsPwMaster(byte isPwMaster) {
    this.isPwMaster = isPwMaster;
  }

  public byte getMaintenanceLocked() {
    return this.maintenanceLocked;
  }

  public void setMaintenanceLocked(byte maintenanceLocked) {
    this.maintenanceLocked = maintenanceLocked;
  }

  public String getModifiedBy() {
    return this.modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public BigInteger getModifiedById() {
    return this.modifiedById;
  }

  public void setModifiedById(BigInteger modifiedById) {
    this.modifiedById = modifiedById;
  }

  public Date getModifiedTs() {
    return this.modifiedTs;
  }

  public void setModifiedTs(Date modifiedTs) {
    this.modifiedTs = modifiedTs;
  }

  public BigInteger getPartnerId() {
    return this.partnerId;
  }

  public void setPartnerId(BigInteger partnerId) {
    this.partnerId = partnerId;
  }

  public int getSessionTimeout() {
    return this.sessionTimeout;
  }

  public void setSessionTimeout(int sessionTimeout) {
    this.sessionTimeout = sessionTimeout;
  }

  public String getSfdcAccountId() {
    return this.sfdcAccountId;
  }

  public void setSfdcAccountId(String sfdcAccountId) {
    this.sfdcAccountId = sfdcAccountId;
  }

  public BigInteger getSystemId() {
    return this.systemId;
  }

  public void setSystemId(BigInteger systemId) {
    this.systemId = systemId;
  }



}
