package com.pluralsight.rajat.conference_with_java_config_advanced.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.rajat.conference_with_java_config_advanced.model.Speaker;
import com.pluralsight.rajat.conference_with_java_config_advanced.repository.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {
	
	private SpeakerRepository repository;
	
	public SpeakerServiceImpl () {
		System.out.println("SpeakerServiceImpl no args constructor");
	}
	@Autowired
	public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
		System.out.println("SpeakerServiceImpl repository constructor");
		repository=speakerRepository;
	}
	
	@PostConstruct
	private void initialize() {
		System.out.println("SpeakServiceImpl called after the constructor");
	}
	
	public List<Speaker> findAll() {
		return repository.findAll();
	}
	
	
	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl setter");
		this.repository = repository;
	}
	
}
