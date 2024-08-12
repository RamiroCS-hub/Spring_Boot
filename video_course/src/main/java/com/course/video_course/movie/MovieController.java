package com.course.video_course.movie;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MovieController {

  private MovieService service;

  MovieController(MovieService service) {
    this.service = service;
  }

  @PostMapping("/movie")
  public Movie createMovie(@RequestBody Movie body) {
    return service.create(body);
  }

  @GetMapping("/movies")
  public List<Movie> findAllMovies() {
    return service.findAll();
  }

  @GetMapping("/movie/{id}")
  public Movie getMethodName(@PathVariable UUID id) {
    return service.findById(id);
  }

}
