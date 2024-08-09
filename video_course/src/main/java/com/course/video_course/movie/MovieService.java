package com.course.video_course.movie;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.video_course.movie.interfaces.IMovieService;

import jakarta.transaction.Transactional;

@Service
public class MovieService implements IMovieService {
  @Autowired
  private IMovieRepository repo;

  @Transactional
  public Movie create(Movie movie) {
    return repo.save(movie);
  }

  @Transactional
  public Movie findById(UUID id) {
    return repo.findById(id).orElse(null);
  }

  @Transactional
  public List<Movie> findAll() {
    return repo.findAll();
  }

  @Transactional
  public void deleteById(UUID id) {
    repo.deleteById(id);
  }
}
