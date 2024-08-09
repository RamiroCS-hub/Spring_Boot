package com.movies.movies.controller;

import org.springframework.web.bind.annotation.RestController;

import com.movies.movies.entities.Genre;
import com.movies.movies.service.genre.GenreService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class GenreController implements IController<Genre, Long> {

  private GenreService service;

  GenreController(GenreService service) {
    this.service = service;
  }

  @GetMapping("genre/{id}")
  public String findById(@PathVariable Long id) {
    return service.findById(id).getName();
  }

  @PostMapping("genre")
  public Long save(@RequestParam String name) {
    Genre genre = new Genre();
    genre.setName(name);
    service.save(genre);
    return genre.getId();
  }

  @GetMapping("genres")
  public List<Genre> findAll() {
    return service.findAll();
  }

}
