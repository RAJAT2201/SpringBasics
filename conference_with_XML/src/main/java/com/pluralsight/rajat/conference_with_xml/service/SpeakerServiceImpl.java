package com.pluralsight.rajat.conference_with_xml.service;

import java.util.List;

import com.pluralsight.rajat.conference_with_xml.model.Speaker;
import com.pluralsight.rajat.conference_with_xml.repository.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl() {
		System.out.println("No arg constructor");
	}
	
	public SpeakerServiceImpl(SpeakerRepository repository) {
		System.out.println("Arg constructor");
		this.repository = repository;
	}
	public List<Speaker> findAll() {
		return repository.findAll();
	}

	public void setRepository(SpeakerRepository repository) {
		this.repository = repository;
	}
}
