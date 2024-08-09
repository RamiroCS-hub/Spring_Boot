package com.movies.movies.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public class ServiceImmp<T, ID> implements IServices<T, ID> {

  private CrudRepository<T, ID> repository;

  protected ServiceImmp(CrudRepository<T, ID> repository) {
    this.repository = repository;
  }

  @Override
  public void save(T entity) {
    repository.save(entity);
  }

  @Override
  public T findById(ID id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void delete(ID id) {
    repository.deleteById(id);
  }

  @Override
  public List<T> findAll() {
    return (List<T>) repository.findAll();
  }

}
