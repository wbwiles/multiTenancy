
package com.xyz.pw.api.services.web.controller;

import com.kastkode.springsandwich.filter.annotation.Before;
import com.kastkode.springsandwich.filter.annotation.BeforeElement;
import com.xyz.pw.api.aux.error.ServiceErrorType;
import com.xyz.pw.api.aux.error.ServiceException;
import com.xyz.pw.api.data.domain.UnitDTO;
import com.xyz.pw.api.data.model.common.Unit;
import com.xyz.pw.api.services.filter.PWSecurityFilter;
import com.xyz.pw.api.services.service.UserService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;


/**
 * The Class AuthController.
 */
@RestController
@Api(tags = "Properties Services")
@Before(@BeforeElement(PWSecurityFilter.class))
public class PropertiesController {

  @Autowired
  private UserService userService;


  @RequestMapping(value = "/api/units", method = RequestMethod.GET)
  @ApiOperation(value = "GetUnit", notes = "Get a unit using a parameter of the unit id", response = Unit.class, httpMethod = "GET")
  public UnitDTO getUnit(@ApiParam(value = "ID of the unit", required = true) @RequestParam(value = "id", required = false) Long id) {
    if (id == null || id <= 0) {
      return userService.getUnitById(0L);
    } else {
      return userService.getUnitById(id);
    }

  }

  /**
   * Update unit.
   *
   * @param unit the unit
   * @param bindingResult the binding result
   * @return the unit
   */
  @RequestMapping(value = "/api/units", method = RequestMethod.PUT, consumes = "application/json")
  @ApiOperation(value = "UpdateUnit", notes = "Update a unit using a body (JSON) of the unit object", httpMethod = "POST")
  @Transactional
  public Unit updateUnit(@Valid Unit unit, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      throw new ServiceException(ServiceErrorType.APPLICATION_ERROR, bindingResult.getFieldErrors().toString());
    }

    return userService.save(unit);


  }


}
