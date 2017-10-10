package com.xyz.pw.api.services.service;

import com.xyz.pw.api.data.domain.UnitDTO;
import com.xyz.pw.api.data.model.common.Unit;

public interface UserService {

  UnitDTO getUnitById(Long id) ;

  Unit save(Unit unit);

}
