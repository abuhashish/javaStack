package com.codingdojo.beltReviwer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.beltReviwer.models.users_events;
@Repository
public interface users_eventsRepository extends CrudRepository<users_events, Long>{

}
