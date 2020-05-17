package com.pluralsight.rajat.conference_with_xml.service;
import java.util.List;

import com.pluralsight.rajat.conference_with_xml.model.Speaker;

public interface SpeakerService {

	List<Speaker> findAll();

}