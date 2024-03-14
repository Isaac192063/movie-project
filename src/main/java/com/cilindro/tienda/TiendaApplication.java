package com.cilindro.tienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TiendaApplication {
	public static void main(String[] args) {
		SpringApplication.run(TiendaApplication.class, args);
	}


	@GetMapping("/")
	public String getSaludo(){
		return "<h1>HELLO WORLD</h1>";
	}
}
