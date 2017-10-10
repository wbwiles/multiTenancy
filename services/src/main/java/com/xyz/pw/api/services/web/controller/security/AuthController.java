
package com.xyz.pw.api.services.web.controller.security;

import com.xyz.pw.api.services.service.security.AuthenticateUserService;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


/**
 * The Class AuthController.
 */
@RestController
@Api(tags = "Authorization Services")
public class AuthController {

  @Autowired
  private AuthenticateUserService authenticateUserService;



  /**
   * Authenticate user.
   *
   * @param username the username
   * @param password the password
   * @return the response entity
   * @throws AuthorizationException the authorization exception
   */
  @RequestMapping(value = "/auth/login", method = RequestMethod.GET)
  @ApiOperation(value = "AuthenticateUser", notes = "Given a user and password, this validates the user credentials", response = String.class, httpMethod = "GET")
  public ResponseEntity<Map<String, String>> authenticateUser(@RequestParam(value = "username", defaultValue = "myusername@mycompany.net") String username, //
      @RequestParam(value = "password", defaultValue = "mypassword") String password) {
    return new ResponseEntity<Map<String, String>>(authenticateUserService.authenticateUser(username, password), HttpStatus.OK);
  }


  @RequestMapping(value = "/auth/apiKey", method = RequestMethod.GET)
  @ApiOperation(value = "AuthenticateUser", notes = "Given a apikey, this validates the user credentials and returns a token", response = String.class, httpMethod = "GET")
  public ResponseEntity<Map<String, String>> authenticateUser(@RequestHeader(value = "Authorization") String apiKey) {
    return new ResponseEntity<Map<String, String>>(authenticateUserService.authenticateApiKey(apiKey), HttpStatus.OK);
  }


}
