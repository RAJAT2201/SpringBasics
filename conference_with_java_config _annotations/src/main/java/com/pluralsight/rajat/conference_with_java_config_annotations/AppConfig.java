package com.pluralsight.rajat.conference_with_java_config_annotations;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.pluralsight.rajat.conference_with_java_config_annotations.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.rajat.conference_with_java_config_annotations.repository.SpeakerRepository;
import com.pluralsight.rajat.conference_with_java_config_annotations.service.SpeakerService;
import com.pluralsight.rajat.conference_with_java_config_annotations.service.SpeakerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight.rajat"})
public class AppConfig {
	/*
	@Bean(name="speakerService")
	@Scope(value=BeanDefinition.SCOPE_SINGLETON) //for protoype BeanDefinition.SCOPE_PROTOTYPE
	public SpeakerService getSpeakerService() {
		//SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository()); // constructor injection
		SpeakerServiceImpl service = new SpeakerServiceImpl(); //autowiring
		//service.setRepository(getSpeakerRepository());  //Setter Injection
		return service;
	}
	
	@Bean(name="speakerRepository")
	public SpeakerRepository getSpeakerRepository() {
		return new HibernateSpeakerRepositoryImpl();
	}
	*/
}
