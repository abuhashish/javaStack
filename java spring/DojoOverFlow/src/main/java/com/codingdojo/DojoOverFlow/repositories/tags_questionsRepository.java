package com.codingdojo.DojoOverFlow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojoOverFlow.models.tags_questions;




@Repository
public interface tags_questionsRepository extends CrudRepository<tags_questions,Long>{
	List <tags_questions> findAll();
}
