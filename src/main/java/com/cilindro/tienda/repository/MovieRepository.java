package com.cilindro.tienda.repository;

import com.cilindro.tienda.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//se le indica el tipo de dato y el tipo de identificados en el generico
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
