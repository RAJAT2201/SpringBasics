package com.pluralsight.rajat.conference_with_java_config_annotations.repository;

import java.util.List;

import com.pluralsight.rajat.conference_with_java_config_annotations.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}