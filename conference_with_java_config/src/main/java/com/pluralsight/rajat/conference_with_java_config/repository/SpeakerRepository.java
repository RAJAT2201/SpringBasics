package com.pluralsight.rajat.conference_with_java_config.repository;

import java.util.List;

import com.pluralsight.rajat.conference_with_java_config.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}