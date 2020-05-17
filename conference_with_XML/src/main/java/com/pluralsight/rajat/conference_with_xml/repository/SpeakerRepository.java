package com.pluralsight.rajat.conference_with_xml.repository;

import java.util.List;

import com.pluralsight.rajat.conference_with_xml.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}