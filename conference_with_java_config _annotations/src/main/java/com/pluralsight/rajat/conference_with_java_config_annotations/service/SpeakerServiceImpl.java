package com.pluralsight.rajat.conference_with_java_config_annotations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.rajat.conference_with_java_config_annotations.model.Speaker;
import com.pluralsight.rajat.conference_with_java_config_annotations.repository.SpeakerRepository;

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
	
	public List<Speaker> findAll() {
		return repository.findAll();
	}
	
	
	public void setRepository(SpeakerRepository repository) {
		System.out.println("SpeakerServiceImpl setter");
		this.repository = repository;
	}
	
}
