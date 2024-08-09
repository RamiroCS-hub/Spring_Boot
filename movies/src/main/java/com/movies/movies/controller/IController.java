package com.movies.movies.controller;

import java.util.List;

public interface IController<T, ID> {
  public String findById(ID id);

  public ID save(String name);

  public List<T> findAll();
}
