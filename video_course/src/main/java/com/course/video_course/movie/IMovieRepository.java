package com.course.video_course.movie;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository
 */
public interface IMovieRepository extends JpaRepository<Movie, UUID> {
}
