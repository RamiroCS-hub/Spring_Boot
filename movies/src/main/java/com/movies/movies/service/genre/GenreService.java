package com.movies.movies.service.genre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.movies.dao.IGenreRepository;
import com.movies.movies.entities.Genre;
import com.movies.movies.service.ServiceImmp;

@Service
public class GenreService implements IGenreService {

  // GenreService(IGenreRepository<Genre, Long> repository) {
  // super(repository);
  // }
  @Autowired
  private IGenreRepository repository;

  @Override
  public void save(Genre entity) {
    repository.save(entity);
  }

  @Override
  public Genre findById(Long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

  @Override
  public List<Genre> findAll() {
    return (List<Genre>) repository.findAll();
  }

}
