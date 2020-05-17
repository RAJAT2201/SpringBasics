package com.pluralsight.rajat.conference_with_java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.rajat.conference_with_java_config.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.rajat.conference_with_java_config.repository.SpeakerRepository;
import com.pluralsight.rajat.conference_with_java_config.service.SpeakerService;
import com.pluralsight.rajat.conference_with_java_config.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="speakerService")
	public SpeakerService getSpeakerService() {
		SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository()); // constructor injection
		//service.setRepository(getSpeakerRepository());  //Setter Injection
		return service;
	}
	
	@Bean(name="speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
}
