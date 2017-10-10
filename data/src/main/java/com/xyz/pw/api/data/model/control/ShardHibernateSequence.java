package com.xyz.pw.api.data.model.control;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The persistent class for the shard_hibernate_sequence database table.
 * 
 */
@Entity
@Table(name = "shard_hibernate_sequence")
public class ShardHibernateSequence implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "sequence_name")
  private String sequenceName;

  @Column(name = "sequence_next_hi_value")
  private BigInteger sequenceNextHiValue;

  @Column(name = "system_id")
  private BigInteger systemId;

  public ShardHibernateSequence() {}

  public String getSequenceName() {
    return this.sequenceName;
  }

  public void setSequenceName(String sequenceName) {
    this.sequenceName = sequenceName;
  }

  public BigInteger getSequenceNextHiValue() {
    return this.sequenceNextHiValue;
  }

  public void setSequenceNextHiValue(BigInteger sequenceNextHiValue) {
    this.sequenceNextHiValue = sequenceNextHiValue;
  }

  public BigInteger getSystemId() {
    return this.systemId;
  }

  public void setSystemId(BigInteger systemId) {
    this.systemId = systemId;
  }

}
