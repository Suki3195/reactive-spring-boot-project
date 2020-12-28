package com.demoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories
public class DemoProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoProjectApplication.class, args);
		System.out.println("I am Cool");
	}

}
