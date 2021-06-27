package com.codingdojo.beltReviwer.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.beltReviwer.models.Event;
import com.codingdojo.beltReviwer.models.State;


@Repository
public interface eventRepository extends CrudRepository<Event, Long> {
	List <Event> findByState(State x);
	List <Event> findAll();
}
