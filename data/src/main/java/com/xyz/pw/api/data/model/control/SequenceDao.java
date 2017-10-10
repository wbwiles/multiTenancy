package com.xyz.pw.api.data.model.control;

import com.xyz.pw.api.data.model.common.Unit;

import org.springframework.stereotype.Repository;


/**
 * The Class UnitDao.
 */
@Repository
public class SequenceDao extends AbstractJpaDao<Unit> implements SequenceDaoImpl {

  /**
   * Instantiates a new unit dao.
   */
  public SequenceDao() {
    super();

    setClazz(Unit.class);
  }

}
