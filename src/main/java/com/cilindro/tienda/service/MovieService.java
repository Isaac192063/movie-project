package com.cilindro.tienda.service;


import com.cilindro.tienda.model.Movie;
import com.cilindro.tienda.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

//autowired es para no instanciar
@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public ArrayList<Movie> getAllMovie(){
        return (ArrayList<Movie>)movieRepository.findAll();
    }

    public Movie saveMovie(Movie newMovie){
        return movieRepository.save(newMovie);
    }
}
