package com.pluralsight.rajat.conference.repository;

import java.util.List;

import com.pluralsight.rajat.conference.model.Speaker;

public interface SpeakerRepository {

	List<Speaker> findAll();

}