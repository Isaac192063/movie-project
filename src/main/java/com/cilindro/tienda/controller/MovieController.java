package com.cilindro.tienda.controller;

import com.cilindro.tienda.model.Movie;
import com.cilindro.tienda.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @GetMapping()
    public ArrayList<Movie> getAllMovie(){
        return movieService.getAllMovie();
    }

    @PostMapping()
    public Movie newMovie(@RequestBody Movie movie){
        return movieService.saveMovie(movie);
    }
}
