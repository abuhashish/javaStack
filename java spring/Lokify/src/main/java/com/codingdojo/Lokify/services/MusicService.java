package com.codingdojo.Lokify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.codingdojo.Lokify.models.Music;
import com.codingdojo.Lokify.models.repositories.MusicRepository;
@Service
public class MusicService {
	private final MusicRepository musicRepo;

	public MusicService(MusicRepository musicRepo) {
		this.musicRepo = musicRepo;
	}
	public List<Music> allMusic() {
		return musicRepo.findAll();
	}
	public Music createMusic(Music b) {
		return musicRepo.save(b);
	}
	public Music findMusic(Long id) {
		Optional<Music> optionalMusic = musicRepo.findById(id);
		if (optionalMusic.isPresent()) {
			return optionalMusic.get();
		} else {
			return null;
		}
	}
	public void deleteMusic(Long id) {
		musicRepo.deleteById(id);
	}
	public Music updateLanguage(Long id, String artist, String title, Integer rating) {
		Optional<Music> Music = musicRepo.findById(id);
		if (Music.isPresent()) {
			Music.get().setArtist(artist);
			Music.get().setTitle(title);
			Music.get().setRating(rating);
			musicRepo.save(Music.get());
			return Music.get();
		} else
			return null;
	}
	public void updateMusic(Music Musics) {
		musicRepo.save(Musics);
	}
	public List<Music> findTop10ByRating(){
		
		return musicRepo.findTop10ByOrderByRatingDesc();
	}
	public Music searchByArtist(String name) {
		return musicRepo.searchByArtist(name);
	}
	public List<Music> findByName(String name){
		return musicRepo.findAllByArtist(name);
	}
}
