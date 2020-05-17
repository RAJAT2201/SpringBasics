package com.pluralsight.rajat.conference_with_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pluralsight.rajat.conference_with_xml.service.SpeakerService;

public class Application {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SpeakerService service = (SpeakerService) appContext.getBean("speakerService");
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
