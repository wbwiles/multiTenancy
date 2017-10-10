package com.xyz.pw.api.data.repositories;

import com.xyz.pw.api.data.ApplicationContextProvider;
import com.xyz.pw.api.data.model.control.LoginUser;

import java.util.Set;

import javax.annotation.PostConstruct;
import javax.persistence.metamodel.EntityType;
import javax.persistence.metamodel.Metamodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class LoginUserDaoImpl extends AbstractJpaControlDAO<LoginUser> implements LoginUserDao {
  private static final Logger LOGGER = LoggerFactory.getLogger(LoginUserDaoImpl.class);


  @Override
  public LoginUser findOne(long id) {
    return null;
  }

  @Override
  public LoginUser update(LoginUser entity) {
    return null;
  }

  private void loadEntityManager() {
    try {
      entityManager = ApplicationContextProvider.getEntityManager();
    } catch (Exception e) {
      LOGGER.error(e.getMessage());
    }
  }

  @Override
  public LoginUser findUser(final String email) {
    if (entityManager == null) {
      loadEntityManager();
    }
    LoginUser loginUser = (LoginUser) entityManager.createQuery("SELECT e FROM LoginUser e WHERE e.email = :email").setParameter("email", email).getSingleResult();
    return loginUser;


  }

  @Override
  public LoginUser findUserByApiKey(final String apiKey) {
    return (LoginUser) entityManager.createQuery("SELECT e FROM LoginUser e WHERE e.apiKey = :apiKey").setParameter("apiKey", apiKey).getSingleResult();

  }
}
