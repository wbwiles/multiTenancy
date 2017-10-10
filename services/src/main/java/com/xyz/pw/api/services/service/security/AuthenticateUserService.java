package com.xyz.pw.api.services.service.security;

import java.util.Map;

public interface AuthenticateUserService {
  Map<String, String> authenticateUser(String username, String password);

  Map<String, String> authenticateApiKey(String apikey);

}
