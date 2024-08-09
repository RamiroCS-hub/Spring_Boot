package com.movies.movies.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movies.entities.Movie;
import com.movies.movies.service.genre.GenreService;
import com.movies.movies.service.movie.MovieService;

import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MovieController {

  private GenreService genreService;
  private MovieService service;

  MovieController(GenreService genreService, MovieService service) {
    this.service = service;
    this.genreService = genreService;
  }

  @GetMapping("pelicula")
  public String create(Model model) {
    Movie movie = new Movie();
    model.addAttribute("pelicula", movie);
    model.addAttribute("titulo", "Nueva pelicula");
    return "pelicula";
  }

  @GetMapping("pelicula/{id}")
  public String edit(@PathVariable String id, Model model) {
    Movie movie = new Movie();
    model.addAttribute("pelicula", movie);
    System.out.println(genreService.findAll());
    model.addAttribute("generos", genreService.findAll());
    model.addAttribute("titulo", "Editar pelicular");
    return "pelicula";
  }

  @PostMapping("movie")
  public String save(@RequestBody Movie movie) {
    service.save(movie);
    return "redirect:home";
  }

  @GetMapping("home")
  public String home() {
    return "home";
  }

}
