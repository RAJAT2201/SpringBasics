package com.pluralsight.rajat.conference_with_java_config_annotations.service;
import java.util.List;

import com.pluralsight.rajat.conference_with_java_config_annotations.model.Speaker;

public interface SpeakerService {

	List<Speaker> findAll();

}