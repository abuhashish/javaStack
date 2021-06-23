package com.codingdojo.DojosAndNinjas.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.DojosAndNinjas.models.Dojo;


@Repository
public interface DojoRepository extends CrudRepository<Dojo,Long> {
	List<Dojo> findAll();
	Optional<Dojo> findById(Long id);
	@Query("SELECT d FROM Dojo d JOIN d.ninjas n")
    List<Dojo> joinDojosAndNinjas();
    
    // inner join retrieving dojos and ninjas
    @Query("SELECT d, n FROM Dojo d JOIN d.ninjas n")
    List<Object[]> joinDojosAndNinjas2();
}
