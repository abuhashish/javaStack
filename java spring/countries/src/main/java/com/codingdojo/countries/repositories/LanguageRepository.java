package com.codingdojo.countries.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.countries.models.Language;
@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

}
