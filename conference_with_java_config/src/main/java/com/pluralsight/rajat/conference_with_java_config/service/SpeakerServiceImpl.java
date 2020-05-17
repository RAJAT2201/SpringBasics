package com.pluralsight.rajat.conference_with_java_config.service;

import com.pluralsight.rajat.conference_with_java_config.model.Speaker;
import com.pluralsight.rajat.conference_with_java_config.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.rajat.conference_with_java_config.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
		repository = speakerRepository;
	}
	
	public List<Speaker> findAll() {
		return repository.findAll();
	}
	
	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}
	
}
