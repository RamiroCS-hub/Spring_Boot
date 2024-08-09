package com.course.video_course.movie;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import com.course.video_course.genre.Genre;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {

  // Movie(Movie movie) {
  // this.name = movie.getName();
  // this.releaseDate = movie.getReleaseDate();
  // this.director = movie.getDirector();
  // }

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String name;
  private Date releaseDate;
  private String director;

  @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
  @JoinTable(name = "movies_genres", joinColumns = @JoinColumn(name = "movie_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "genre_id", referencedColumnName = "id"))
  private List<Genre> genres;

  public UUID getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(Date releaseDate) {
    this.releaseDate = releaseDate;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public List<Genre> getGenres() {
    return genres;
  }
}
