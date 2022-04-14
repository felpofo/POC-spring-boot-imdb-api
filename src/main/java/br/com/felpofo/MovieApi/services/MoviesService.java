package br.com.felpofo.MovieApi.services;

import br.com.felpofo.MovieApi.models.Movie;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import kong.unirest.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service
public class MoviesService {

  public JsonNode fetchMovies() {
    HttpResponse<JsonNode> response = Unirest.get("https://imdb-api.com/en/API/Top250Movies/<apikey>").asJson();

    return response.getBody();
  }

  public Movie[] getMovies() throws IOException {
    Gson gson = new GsonBuilder()
      .setDateFormat("HH:mm:ss dd/MM/yyyy")
      .create();

     JSONObject response = fetchMovies().getObject();

     return gson.fromJson(response.get("items").toString(), Movie[].class);
  }
}
