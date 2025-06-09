package com.example.thermosensible;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ThermosensibleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThermosensibleApplication.class, args);
	}

}
