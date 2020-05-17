package com.pluralsight.rajat.conference.service;
import java.util.List;

import com.pluralsight.rajat.conference.model.Speaker;

public interface SpeakerService {

	List<Speaker> findAll();

}