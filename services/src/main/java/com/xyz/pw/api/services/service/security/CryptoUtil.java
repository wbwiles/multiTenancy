package com.xyz.pw.api.services.service.security;

import com.xyz.pw.api.services.Constants;

import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Component;

/**
 * The Class CryptoUtil.
 */
@Component
public class CryptoUtil {

  /**
   * Check password using the hash.
   *
   * @param userHash the user hash
   * @param password the password
   * @return true, if successful
   */
  public static boolean checkPassword(String userHash, String password) {
    return BCrypt.checkpw(password, userHash);
  }

  /**
   * Hash the password.
   *
   * @param password The password to hash.
   * @return the string
   */
  public static String hash(String password) {
    return BCrypt.hashpw(password, BCrypt.gensalt(Constants.PASSWORD_HASH_ITERATION_COUNT));
  }

}
