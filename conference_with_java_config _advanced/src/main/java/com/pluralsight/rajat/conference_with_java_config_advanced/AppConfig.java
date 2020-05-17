package com.pluralsight.rajat.conference_with_java_config_advanced;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.pluralsight.rajat.conference_with_java_config_advanced.util.CalendarFactory;

@Configuration
@ComponentScan({"com.pluralsight.rajat"})
public class AppConfig {
	
	@Bean(name = "cal")
	public CalendarFactory calFactory() {
		CalendarFactory factory = new CalendarFactory();
		factory.addDays(2);
		return factory;
	}
	
	@Bean
	public Calendar cal() throws Exception{
		return calFactory().getObject();
	}
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
