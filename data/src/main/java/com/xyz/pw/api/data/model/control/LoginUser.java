package com.xyz.pw.api.data.model.control;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the login_user database table.
 * 
 */
@Entity
@Table(name = "login_user")
public class LoginUser implements Serializable {


  private static final long serialVersionUID = -5061336519526581176L;

  @Id
  private String id;

  @Column(name = "api_key")
  private String apiKey;

  @Column(name = "created_by")
  private String createdBy;

  @Column(name = "created_by_id")
  private BigInteger createdById;

  @Column(name = "created_ts")
  private Timestamp createdTs;

  @Column(name = "device_token")
  private String deviceToken;

  private String digest;

  private String email;

  @Column(name = "first_name")
  private String firstName;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "granted_access_date")
  private Date grantedAccessDate;

  private String hash;

  @Column(name = "invalid_login_attempts")
  private byte invalidLoginAttempts;

  @Column(name = "is_demo")
  private byte isDemo;

  @Column(name = "is_franchise_user")
  private byte isFranchiseUser;

  @Column(name = "is_locked_out")
  private byte isLockedOut;

  @Column(name = "is_rp_sso_linked")
  private byte isRpSsoLinked;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "last_login_time")
  private Date lastLoginTime;

  @Column(name = "last_name")
  private String lastName;

  @Temporal(TemporalType.DATE)
  @Column(name = "last_passwd_reset_date")
  private Date lastPasswdResetDate;

  @Column(name = "lost_passwd_answer")
  private String lostPasswdAnswer;

  @Column(name = "lost_passwd_question")
  private String lostPasswdQuestion;

  @Column(name = "master_user_id")
  private BigInteger masterUserId;

  @Column(name = "modified_by")
  private String modifiedBy;

  @Column(name = "modified_by_id")
  private BigInteger modifiedById;

  @Column(name = "modified_ts")
  private Timestamp modifiedTs;

  @Column(name = "privilege_level")
  private int privilegeLevel;

  @Column(name = "reset_passwd_code")
  private String resetPasswdCode;

  @Temporal(TemporalType.DATE)
  @Column(name = "reset_passwd_date")
  private Date resetPasswdDate;

  private String salt;

  private String status;

  @Column(name = "updated_password")
  private byte updatedPassword;

  @Column(name = "user_timezone_code")
  private String userTimezoneCode;

  // bi-directional many-to-one association to Organization
  @ManyToOne
  @JoinColumn(name = "system_id")
  private Organization organization;

  public LoginUser() {}

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getApiKey() {
    return this.apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
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

  public Timestamp getCreatedTs() {
    return this.createdTs;
  }

  public void setCreatedTs(Timestamp createdTs) {
    this.createdTs = createdTs;
  }

  public String getDeviceToken() {
    return this.deviceToken;
  }

  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  public String getDigest() {
    return this.digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Date getGrantedAccessDate() {
    return this.grantedAccessDate;
  }

  public void setGrantedAccessDate(Date grantedAccessDate) {
    this.grantedAccessDate = grantedAccessDate;
  }

  public String getHash() {
    return this.hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public byte getInvalidLoginAttempts() {
    return this.invalidLoginAttempts;
  }

  public void setInvalidLoginAttempts(byte invalidLoginAttempts) {
    this.invalidLoginAttempts = invalidLoginAttempts;
  }

  public byte getIsDemo() {
    return this.isDemo;
  }

  public void setIsDemo(byte isDemo) {
    this.isDemo = isDemo;
  }

  public byte getIsFranchiseUser() {
    return this.isFranchiseUser;
  }

  public void setIsFranchiseUser(byte isFranchiseUser) {
    this.isFranchiseUser = isFranchiseUser;
  }

  public byte getIsLockedOut() {
    return this.isLockedOut;
  }

  public void setIsLockedOut(byte isLockedOut) {
    this.isLockedOut = isLockedOut;
  }

  public byte getIsRpSsoLinked() {
    return this.isRpSsoLinked;
  }

  public void setIsRpSsoLinked(byte isRpSsoLinked) {
    this.isRpSsoLinked = isRpSsoLinked;
  }

  public Date getLastLoginTime() {
    return this.lastLoginTime;
  }

  public void setLastLoginTime(Date lastLoginTime) {
    this.lastLoginTime = lastLoginTime;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getLastPasswdResetDate() {
    return this.lastPasswdResetDate;
  }

  public void setLastPasswdResetDate(Date lastPasswdResetDate) {
    this.lastPasswdResetDate = lastPasswdResetDate;
  }

  public String getLostPasswdAnswer() {
    return this.lostPasswdAnswer;
  }

  public void setLostPasswdAnswer(String lostPasswdAnswer) {
    this.lostPasswdAnswer = lostPasswdAnswer;
  }

  public String getLostPasswdQuestion() {
    return this.lostPasswdQuestion;
  }

  public void setLostPasswdQuestion(String lostPasswdQuestion) {
    this.lostPasswdQuestion = lostPasswdQuestion;
  }

  public int getMasterUserId() {
    return this.masterUserId;
  }

  public void setMasterUserId(int masterUserId) {
    this.masterUserId = masterUserId;
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

  public Timestamp getModifiedTs() {
    return this.modifiedTs;
  }

  public void setModifiedTs(Timestamp modifiedTs) {
    this.modifiedTs = modifiedTs;
  }

  public int getPrivilegeLevel() {
    return this.privilegeLevel;
  }

  public void setPrivilegeLevel(int privilegeLevel) {
    this.privilegeLevel = privilegeLevel;
  }

  public String getResetPasswdCode() {
    return this.resetPasswdCode;
  }

  public void setResetPasswdCode(String resetPasswdCode) {
    this.resetPasswdCode = resetPasswdCode;
  }

  public Date getResetPasswdDate() {
    return this.resetPasswdDate;
  }

  public void setResetPasswdDate(Date resetPasswdDate) {
    this.resetPasswdDate = resetPasswdDate;
  }

  public String getSalt() {
    return this.salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public byte getUpdatedPassword() {
    return this.updatedPassword;
  }

  public void setUpdatedPassword(byte updatedPassword) {
    this.updatedPassword = updatedPassword;
  }

  public String getUserTimezoneCode() {
    return this.userTimezoneCode;
  }

  public void setUserTimezoneCode(String userTimezoneCode) {
    this.userTimezoneCode = userTimezoneCode;
  }

  public Organization getOrganization() {
    return this.organization;
  }

  public void setOrganization(Organization organization) {
    this.organization = organization;
  }

}
