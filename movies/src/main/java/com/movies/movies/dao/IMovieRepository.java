package com.movies.movies.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movies.movies.entities.Movie;

@Repository
public interface IMovieRepository extends CrudRepository<Movie, Long> {

}
