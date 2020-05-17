package com.pluralsight.rajat.conference_with_java_config_advanced.service;
import java.util.List;

import com.pluralsight.rajat.conference_with_java_config_advanced.model.Speaker;

public interface SpeakerService {

	List<Speaker> findAll();

}