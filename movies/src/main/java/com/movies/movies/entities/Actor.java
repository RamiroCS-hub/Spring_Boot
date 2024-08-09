package com.movies.movies.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "actors")
public class Actor implements Serializable {
  private static final long serialVersionUID = -4509451998659894417L;
  // VARIABLES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @Column(name = "url_image")
  private String urlImage;

  // GETTERS AND SETTERS
  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrlImage() {
    return this.urlImage;
  }

  public void set(String url) {
    this.urlImage = url;
  }
}
