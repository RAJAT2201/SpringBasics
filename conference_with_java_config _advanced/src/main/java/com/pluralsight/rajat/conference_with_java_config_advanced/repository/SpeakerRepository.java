package com.pluralsight.rajat.conference_with_java_config_advanced.repository;

import java.util.List;

import com.pluralsight.rajat.conference_with_java_config_advanced.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}