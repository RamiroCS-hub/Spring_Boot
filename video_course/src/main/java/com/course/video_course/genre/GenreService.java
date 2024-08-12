package com.course.video_course.genre;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.video_course.genre.interfaces.IGenreService;

import jakarta.transaction.Transactional;

@Service
public class GenreService implements IGenreService {

  @Autowired
  private IGenreRepository repo;

  @Override
  @Transactional
  public Genre create(Genre entity) {
    return repo.save(entity);
  }

  @Override
  @Transactional
  public Genre findById(UUID id) {
    return repo.findById(id).orElse(null);
  }

  @Override
  @Transactional
  public List<Genre> findAll() {
    return repo.findAll();
  }

  @Override
  @Transactional
  public void deleteById(UUID id) {
    repo.deleteById(id);
  }

}
