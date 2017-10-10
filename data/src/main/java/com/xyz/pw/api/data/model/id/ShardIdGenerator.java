package com.xyz.pw.api.data.model.id;

import com.xyz.pw.api.data.ApplicationContextProvider;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.enhanced.TableGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ShardIdGenerator extends TableGenerator {

  private static final Logger LOGGER = LoggerFactory.getLogger(ShardIdGenerator.class);

  @Override
  public Serializable generate(SessionImplementor sessionImpl, Object object) throws HibernateException {

    SessionImplementor session = null;
    try {
      EntityManager em = ApplicationContextProvider.getEntityManager();
      session = (SessionImplementor) em.unwrap(Session.class);
    } catch (Exception e) {
      LOGGER.error(e.getMessage(), e);
      throw new HibernateException(e.getMessage());
    }
    return super.generate(session, object);
  }


}
