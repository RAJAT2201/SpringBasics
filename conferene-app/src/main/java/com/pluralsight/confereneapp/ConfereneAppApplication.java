package com.pluralsight.confereneapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConfereneAppApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ConfereneAppApplication.class, args);
	}

}
