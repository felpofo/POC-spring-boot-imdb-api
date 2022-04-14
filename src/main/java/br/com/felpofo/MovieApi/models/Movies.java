package br.com.felpofo.MovieApi.models;

import com.google.gson.annotations.SerializedName;

public class Movies {
  @SerializedName("items")
  private Movie[] movies;
  @SerializedName("errorMessage")
  private String error;
}
