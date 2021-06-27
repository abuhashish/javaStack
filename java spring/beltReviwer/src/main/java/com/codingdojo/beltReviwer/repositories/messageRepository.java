package com.codingdojo.beltReviwer.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.beltReviwer.models.Message;
@Repository
public interface messageRepository extends CrudRepository<Message, Long> {

}
