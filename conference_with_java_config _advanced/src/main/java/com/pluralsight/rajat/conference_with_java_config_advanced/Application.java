package com.pluralsight.rajat.conference_with_java_config_advanced;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pluralsight.rajat.conference_with_java_config_advanced.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//SpeakerService service = 
		SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
		
		//System.out.println(service); //for checking singleton/prototype
		System.out.println(service.findAll().get(0).getFirstName());
		System.out.println(service.findAll().get(0).getSeedName());
		
		//SpeakerService service2 = appContext.getBean("speakerService", SpeakerService.class); //for checking singleton/prototype
		//System.out.println(service2);
	}

}
