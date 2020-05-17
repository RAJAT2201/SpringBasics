package com.pluralsight.rajat.conference;

import com.pluralsight.rajat.conference.service.SpeakerService;
import com.pluralsight.rajat.conference.service.SpeakerServiceImpl;

public class Application {

	public static void main(String[] args) {
		
		SpeakerService service = new SpeakerServiceImpl();
		System.out.println(service.findAll().get(0).getFirstName());

	}

}
