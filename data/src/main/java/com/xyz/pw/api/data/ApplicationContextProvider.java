package com.xyz.pw.api.data;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * The Class ApplicationContextProvider.
 */
@Component
public class ApplicationContextProvider implements ApplicationContextAware {

  private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationContextProvider.class);

  private static ApplicationContext applicationContext;

  @Override
  public synchronized void setApplicationContext(final ApplicationContext applicationContext) {
    ApplicationContextProvider.applicationContext = applicationContext;

  }

  /**
   * Gets the entity manager.
   *
   * @return the entity manager
   * @throws Exception the exception
   */
  @PostConstruct
  public static EntityManager getEntityManager() throws Exception {
    EntityManager bean = null;
    try {
      LOGGER.info("Loading the entity manager for the entityControlFactory.");
      bean = applicationContext.getBean("entityControlFactory", EntityManager.class);
    } catch (Exception e) {
      throw new Exception("No session bean found for entityControlFactory");
    }
    return bean;
  }

}
