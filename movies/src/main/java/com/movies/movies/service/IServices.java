package com.movies.movies.service;

import java.util.List;

public interface IServices<T, ID> {

  public void save(T entity);

  public T findById(ID id);

  public void delete(ID id);

  public List<T> findAll();
}
