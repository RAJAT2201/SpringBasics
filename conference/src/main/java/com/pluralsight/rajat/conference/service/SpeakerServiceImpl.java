package com.pluralsight.rajat.conference.service;

import com.pluralsight.rajat.conference.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.rajat.conference.repository.SpeakerRepository;

import java.util.List;

import com.pluralsight.rajat.conference.model.Speaker;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
	
	public List<Speaker> findAll() {
		return repository.findAll();
	}
}
