package com.xyz.pw.api.data.model.control;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the connection database table.
 * 
 */
@Entity
@Table(name = "connection")
public class Connection implements Serializable {

  private static final long serialVersionUID = 3288309474836462095L;

  @Id
  private String id;

  @Column(name = "accept_new_organization")
  private byte acceptNewOrganization;

  @Column(name = "host_addresses")
  private String hostAddresses;

  @Column(name = "last_time_accepted")
  private Timestamp lastTimeAccepted;

  private String name;

  @Column(name = "schema_name")
  private String schemaName;

  @Column(name = "system_id")
  private BigInteger systemId;


  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public byte getAcceptNewOrganization() {
    return this.acceptNewOrganization;
  }

  public void setAcceptNewOrganization(byte acceptNewOrganization) {
    this.acceptNewOrganization = acceptNewOrganization;
  }

  public String getHostAddresses() {
    return this.hostAddresses;
  }

  public void setHostAddresses(String hostAddresses) {
    this.hostAddresses = hostAddresses;
  }

  public Timestamp getLastTimeAccepted() {
    return this.lastTimeAccepted;
  }

  public void setLastTimeAccepted(Timestamp lastTimeAccepted) {
    this.lastTimeAccepted = lastTimeAccepted;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSchemaName() {
    return this.schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public BigInteger getSystemId() {
    return this.systemId;
  }

  public void setSystemId(BigInteger systemId) {
    this.systemId = systemId;
  }

}
