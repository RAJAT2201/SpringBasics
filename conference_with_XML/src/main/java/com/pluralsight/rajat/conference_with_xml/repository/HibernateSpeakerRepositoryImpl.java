package com.pluralsight.rajat.conference_with_xml.repository;

import java.util.ArrayList;
import java.util.List;

import com.pluralsight.rajat.conference_with_xml.model.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
	
	public List<Speaker> findAll() {
		List<Speaker> speakers = new ArrayList<Speaker>();
		
		Speaker speaker = new Speaker();
		speaker.setFirstName("Rajat");
		speaker.setLastName("Rastogi");
		
		speakers.add(speaker);
		return speakers;
	}
	
	
}
