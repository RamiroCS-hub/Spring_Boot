package com.course.video_course.interfaces;

import java.util.List;

public interface IService<T, ID> {

  T create(T entity);

  T findById(ID id);

  List<T> findAll();

  void deleteById(ID id);

}
