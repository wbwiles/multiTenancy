package com.xyz.pw.api.data.repositories;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

public abstract class AbstractJpaControlDAO<T extends Serializable> {

  protected Class<T> clazz;

  protected EntityManager entityManager;

  public final void setClazz(final Class<T> clazzToSet) {
    this.clazz = clazzToSet;
  }

  public T findOne(final long id) {
    return entityManager.find(clazz, id);
  }

  @SuppressWarnings("unchecked")
  public List<T> findAll() {
    return entityManager.createQuery("from " + clazz.getName()).getResultList();
  }

  public void create(final T entity) {
    entityManager.persist(entity);
  }

  public T update(final T entity) {
    return entityManager.merge(entity);
  }

  public void delete(final T entity) {
    entityManager.remove(entity);
  }

  public void deleteById(final long entityId) {
    final T entity = findOne(entityId);
    delete(entity);
  }

}
