package com.codingdojo.DojoOverFlow.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojoOverFlow.models.Question;



@Repository
public interface QuestionRepository extends CrudRepository<Question,Long>{
	List <Question> findAll();
	Optional <Question> findById(Long id);
}
