package com.xyz.pw.api.services.service;

import com.kastkode.springsandwich.filter.annotation.Before;
import com.kastkode.springsandwich.filter.annotation.BeforeElement;
import com.xyz.pw.api.aux.error.ServiceErrorType;
import com.xyz.pw.api.aux.error.ServiceException;
import com.xyz.pw.api.data.domain.UnitDTO;
import com.xyz.pw.api.data.model.common.Unit;
import com.xyz.pw.api.data.repositories.UnitDao;
import com.xyz.pw.api.services.filter.PWSecurityFilter;

import org.apache.commons.lang3.RandomStringUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Before(@BeforeElement(PWSecurityFilter.class))
public class UnitServiceImpl implements UserService {

  private ModelMapper modelMapper;
  private UnitDao unitDao;


  /**
   * Instantiates a new unit service.
   *
   * @param modelMapper the model mapper
   * @param unitDao the unit dao
   */
  @Autowired
  public UnitServiceImpl(ModelMapper modelMapper, UnitDao unitDao) {
    super();
    this.modelMapper = modelMapper;
    this.unitDao = unitDao;
  }

  @Override
  @Transactional(readOnly = true)
  public UnitDTO getUnitById(Long id) {
    
    
    Unit unit = unitDao.findOne(id);
    if (unit == null) {
      throw new  ServiceException(ServiceErrorType.RESOURCE_NOT_FOUND, new String[] {"'unit'"},"ID was :" + String.valueOf(id));
    }
    UnitDTO unitDTO = modelMapper.map(unit, UnitDTO.class);
    return unitDTO;
  }

  @Transactional(readOnly = false)
  @Override
  public Unit save(Unit unit) {
    unit.setComments(RandomStringUtils.randomAlphabetic(30));
    return unitDao.update(unit);

  }



}
