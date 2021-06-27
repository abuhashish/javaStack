package com.codingdojo.beltReviwer.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.beltReviwer.models.State;

public interface stateRepository extends CrudRepository<State, Long>{

	Optional<State> findByName(String state);
	List <State> findAll();
}
