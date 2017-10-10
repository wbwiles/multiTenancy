package com.xyz.pw.api.data.repositories;

import com.xyz.pw.api.data.model.control.LoginUser;

public interface LoginUserDao {
  LoginUser findOne(long id);

  LoginUser update(LoginUser entity);

  LoginUser findUser(String username);

  LoginUser findUserByApiKey(String apiKey);

}
