package br.com.felpofo.MovieApi.controllers;

import br.com.felpofo.MovieApi.services.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Controller
@RequestMapping("/movies")
public class MoviesController {

  @Autowired
  MoviesService moviesService;

  @GetMapping
  @ModelAttribute("movies")
  public void getMovies(HttpServletRequest request) {
    try {
      request.setAttribute("movies", moviesService.getMovies());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
