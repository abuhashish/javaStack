package com.codingdojo.DojoOverFlow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojoOverFlow.models.Answer;



@Repository
public interface AnswerRepository extends CrudRepository<Answer,Long>{

}
