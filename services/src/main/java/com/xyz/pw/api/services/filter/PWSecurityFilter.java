package com.xyz.pw.api.services.filter;

import com.kastkode.springsandwich.filter.api.BeforeHandler;
import com.kastkode.springsandwich.filter.api.Flow;
import com.xyz.pw.api.aux.error.ServiceErrorType;
import com.xyz.pw.api.aux.error.ServiceException;
import com.xyz.pw.api.services.service.security.AuthenticateTokenService;
import com.xyz.pw.api.services.service.security.IdentityPrinciple;

import java.util.Arrays;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;



@Component
public class PWSecurityFilter implements BeforeHandler {
  protected static final String SECURITY_HEADER = "Authorization";
  protected static final Logger LOGGER = LoggerFactory.getLogger(PWSecurityFilter.class);
  protected static final String AUTH_TOKEN_PREFIX = "Bearer ";

  @Autowired
  private AuthenticateTokenService authenticateTokenService = null;

  @Override
  public Flow handle(HttpServletRequest request, HttpServletResponse response, HandlerMethod handler, String[] flags) throws Exception {
    // determine if this request is authorized, using daos or any other mechanism.
    // you have full access to Spring context and autowiring here
    // to halt this request and prevent execution of the controller, return Flow.HALT
    // you may also redirect to a login page here if desired

     String token = Optional.of(request.getHeader(SECURITY_HEADER))//
     .filter(header -> StringUtils.startsWith(header, AUTH_TOKEN_PREFIX))//
     .map(header -> StringUtils.substring(header, AUTH_TOKEN_PREFIX.length()))//
     .orElseThrow(() -> new
     ServiceException(ServiceErrorType.AUTHORIZATION_FAILED_NO_CREDENTIALS));

     IdentityPrinciple identityPrinciple = authenticateTokenService.authenticateToken(token);
     LOGGER.info(token);
     LOGGER.info(Arrays.toString(flags));
    return Flow.CONTINUE;
  }
}
