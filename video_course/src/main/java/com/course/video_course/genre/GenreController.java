package com.course.video_course.genre;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class GenreController {

  private GenreService service;

  GenreController(GenreService service) {
    this.service = service;
  }

  @GetMapping("/genres")
  public List<Genre> getAll() {
    return service.findAll();
  }

  @PostMapping("/genre")
  public Genre create(@RequestBody Genre entity) {
    return service.create(entity);
  }

}
