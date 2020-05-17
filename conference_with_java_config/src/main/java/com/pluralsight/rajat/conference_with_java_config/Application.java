package com.pluralsight.rajat.conference_with_java_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.rajat.conference_with_java_config.service.SpeakerService;
import com.pluralsight.rajat.conference_with_java_config.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//SpeakerService service = 
		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
