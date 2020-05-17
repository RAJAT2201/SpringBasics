package com.pluralsight.rajat.conference_with_java_config.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pluralsight.rajat.conference_with_java_config.model.Speaker;
import com.pluralsight.rajat.conference_with_java_config.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl () {
		System.out.println("No args construtor");
	}
	
	public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
		repository = speakerRepository;
	}
	
	public List<Speaker> findAll() {
		return repository.findAll();
	}
	@Autowired //for autowiring	
	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}
	
}
