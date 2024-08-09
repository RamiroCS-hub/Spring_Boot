package com.movies.movies.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.movies.movies.entities.Genre;

@Repository
public interface IGenreRepository extends CrudRepository<Genre, Long> {

}
