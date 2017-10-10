package com.xyz.pw.api.services.service.security;

import com.google.common.collect.ImmutableMap;
import com.xyz.pw.api.aux.error.ServiceErrorType;
import com.xyz.pw.api.aux.error.ServiceException;
import com.xyz.pw.api.data.model.control.LoginUser;
import com.xyz.pw.api.data.repositories.LoginUserDao;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

@Component
public class AuthenticateUserServiceImpl implements AuthenticateUserService {
  private static final Logger logger = LoggerFactory.getLogger(AuthenticateUserServiceImpl.class);

  private LoginUserDao loginUserDao;
  private AuthenticateTokenService authenticateTokenService;

  @Autowired
  public AuthenticateUserServiceImpl(LoginUserDao loginUserDao, AuthenticateTokenService authenticateTokenService) {
    this.loginUserDao = loginUserDao;
    this.authenticateTokenService = authenticateTokenService;
  }

  @Override
  public Map<String, String> authenticateUser(final String username, final String password) {
    try {
      return ImmutableMap.of("access-key", generateToken(username, password));
    } catch (Exception e) {
      logger.error(e.getMessage(), e);
      throw new ServiceException(ServiceErrorType.AUTHENTICATION_FAILED_ERROR, username);
    }

  }


  @Override
  public Map<String, String> authenticateApiKey(final String apiKey) {
    try {
      return ImmutableMap.of("access-key", generateToken(apiKey));
    } catch (Exception e) {
      throw new ServiceException(ServiceErrorType.AUTHORIZATION_FAILED_ERROR, e);
    }
  }


  private String generateToken(final String username, final String password) {
    String token = null;
    try {

      LoginUser loginUser = loginUserDao.findUser(username);

      if (!CryptoUtil.checkPassword(loginUser.getHash(), password)) {
        logger.warn("Password was not correct {}", username);
        throw new ServiceException(ServiceErrorType.AUTHORIZATION_FAILED_ERROR);
      }
      token = authenticateTokenService.generateAccessToken(loginUser.getEmail(), loginUser.getOrganization().getId());

    } catch (ServiceException e) {
      throw e;

    } catch (EmptyResultDataAccessException e) {
      logger.warn("User not found {}", username);
      throw new ServiceException(ServiceErrorType.AUTHORIZATION_FAILED_ERROR, e);

    } catch (Exception e) {
      logger.error(e.getMessage(), e);
      throw e;
    }


    return token;
  }

  private String generateToken(final String apiKey) {
    String token = null;
    try {

      LoginUser loginUser = loginUserDao.findUserByApiKey(apiKey);
      token = authenticateTokenService.generateAccessToken(loginUser.getEmail(), loginUser.getOrganization().getId());

    } catch (EmptyResultDataAccessException e) {
      logger.warn("apiKey not found {}", apiKey);
      throw e;

    } catch (Exception e) {
      throw e;
    }

    return token;
  }



}
