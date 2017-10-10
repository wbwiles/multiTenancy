package com.xyz.pw.api.services.service.security;


import com.xyz.pw.api.aux.error.ServiceErrorType;
import com.xyz.pw.api.aux.error.ServiceException;

import java.security.Key;

import javax.crypto.spec.SecretKeySpec;

import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.MalformedClaimException;
import org.jose4j.jwt.consumer.InvalidJwtException;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;
import org.jose4j.lang.JoseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class AuthenticateTokenServiceImpl implements AuthenticateTokenService {
  private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticateTokenServiceImpl.class);
  private final Key key = new SecretKeySpec("F7BF6189E1BD8ABB757BDB85B6282Q83927ZO#".getBytes(), "HmacSHA256");


  @Override
  public IdentityPrinciple authenticateToken(final String authentication) {
    IdentityPrinciple result = null;
    try {
      final JwtConsumer jwtConsumer = new JwtConsumerBuilder().setExpectedIssuer("identity.xyz.com").setExpectedAudience("api.xyz.com").setRequireSubject().setRequireExpirationTime().setVerificationKey(key).build();
      final JwtClaims claims = jwtConsumer.processToClaims(authentication);
      result = new IdentityPrinciple(claims.getSubject(), Long.valueOf(claims.getClaimValue("orgId", String.class)));
    } catch (InvalidJwtException e) {
      LOGGER.error(e.getMessage());
    } catch (MalformedClaimException e) {
      LOGGER.error(e.getMessage());
    }
    if (result == null) {
      throw new ServiceException(ServiceErrorType.AUTHENTICATION_FAILED_ERROR);
    }
    return result;
  }

  @Override
  public String generateAccessToken(final String userName, final String orgId) {
    String result = null;
    try {
      final JwtClaims claims = new JwtClaims();
      claims.setIssuer("identity.xyz.com");
      claims.setAudience("api.xyz.com");
      claims.setSubject(userName);
      claims.setClaim("orgId", orgId);
      claims.setExpirationTimeMinutesInTheFuture(120);

      final JsonWebSignature jws = new JsonWebSignature();
      jws.setPayload(claims.toJson());
      jws.setKey(key);
      jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.HMAC_SHA256);

      result = jws.getCompactSerialization();
    } catch (JoseException e) {
      String message = new StringBuilder("Unable to generate access token: ").append(userName).toString();
      LOGGER.error(message, e.getMessage(), e);
      throw new ServiceException(ServiceErrorType.AUTHORIZATION_FAILED_GENERAL_ERROR, message);
    }
    return result;
  }


}
