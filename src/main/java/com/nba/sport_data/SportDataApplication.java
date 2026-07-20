package com.nba.sport_data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class SportDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SportDataApplication.class, args);
	}

	@GetMapping
	public String helloworld() {
		return "Hello";
	}
}
