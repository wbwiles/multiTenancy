package com.xyz.pw.api.data.repositories;

import com.xyz.pw.api.data.model.common.Unit;

import org.springframework.stereotype.Repository;


/**
 * The Class UnitDao.
 */
@Repository
public class UnitDaoImpl extends AbstractJpaCommonDAO<Unit> implements UnitDao {

  /**
   * Instantiates a new unit dao.
   */
  public UnitDaoImpl() {
    super();

    setClazz(Unit.class);
  }


}
