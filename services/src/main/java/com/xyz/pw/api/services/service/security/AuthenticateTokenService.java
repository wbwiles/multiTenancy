package com.xyz.pw.api.services.service.security;

import java.util.Optional;

public interface AuthenticateTokenService {

  IdentityPrinciple authenticateToken(String authentication);

  String generateAccessToken(String userName, String orgId);

}
