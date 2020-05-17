package com.pluralsight.rajat.conference_with_java_config_annotations.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.rajat.conference_with_java_config_annotations.model.Speaker;

@Repository("speakerRepository")
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
