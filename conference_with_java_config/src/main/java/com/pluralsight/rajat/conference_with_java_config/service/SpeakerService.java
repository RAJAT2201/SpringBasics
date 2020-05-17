package com.pluralsight.rajat.conference_with_java_config.service;
import java.util.List;

import com.pluralsight.rajat.conference_with_java_config.model.Speaker;

public interface SpeakerService {

	List<Speaker> findAll();

}