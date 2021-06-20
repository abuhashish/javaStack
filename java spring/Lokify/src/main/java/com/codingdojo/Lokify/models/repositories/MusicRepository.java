package com.codingdojo.Lokify.models.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.Lokify.models.Music;


@Repository
public interface MusicRepository extends CrudRepository<Music,Long> {
	List<Music> findAll();
	List<Music> findTop10ByOrderByRatingDesc();
	Music searchByArtist(String name);
	List<Music> findAllByArtist(String name);
}
