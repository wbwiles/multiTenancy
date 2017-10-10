package com.xyz.pw.api.data.model.control;

import com.xyz.pw.api.data.model.common.Unit;

import java.util.List;


public interface SequenceDaoImpl {

  Unit findOne(long id);

  List<Unit> findAll();

  void create(Unit entity);

  Unit update(Unit entity);

  void delete(Unit entity);

  void deleteById(long entityId);

}
