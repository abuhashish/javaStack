package com.codingdojo.beltReviwer.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.codingdojo.beltReviwer.models.User;



@Repository
public interface userRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
    Optional <User> findById(Long id);
}