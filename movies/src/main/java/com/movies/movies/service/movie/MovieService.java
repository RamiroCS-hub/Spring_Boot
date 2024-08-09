package com.movies.movies.service.movie;

import java.util.List;

import org.springframework.stereotype.Service;

import com.movies.movies.dao.IMovieRepository;
import com.movies.movies.entities.Movie;

@Service
public class MovieService implements IMovieService {

  // MovieService(IMovieRepository<Movie, Long> repository) {
  // super(repository);
  // }
  private IMovieRepository repository;

  MovieService(IMovieRepository repository) {
    this.repository = repository;
  }

  @Override
  public void save(Movie entity) {
    repository.save(entity);
  }

  @Override
  public Movie findById(Long id) {
    return repository.findById(id).orElse(null);
  }

  @Override
  public void delete(Long id) {
    repository.deleteById(id);
  }

  @Override
  public List<Movie> findAll() {
    return (List<Movie>) repository.findAll();
  }
}
