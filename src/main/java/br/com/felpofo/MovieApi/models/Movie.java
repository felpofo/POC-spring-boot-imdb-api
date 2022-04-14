package br.com.felpofo.MovieApi.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
  private String id;
  private String rank;
  private String title;
  private String fullTitle;
  private String year;
  private String image;
  private String crew;
  private String imDbRating;
  private String imDbRatingCount;
}
