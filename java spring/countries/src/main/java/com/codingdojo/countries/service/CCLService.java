package com.codingdojo.countries.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.countries.models.City;
import com.codingdojo.countries.models.Country;
import com.codingdojo.countries.repositories.CityRepository;
import com.codingdojo.countries.repositories.CountryRepository;
import com.codingdojo.countries.repositories.LanguageRepository;

@Service
public class CCLService {
private final CountryRepository CoR;
private final CityRepository CiR;
private final LanguageRepository LR;
public CCLService(CountryRepository coR, CityRepository ciR, LanguageRepository lR) {
	CoR = coR;
	CiR = ciR;
	LR = lR;
}
public List <Country> joinCountriesAndLanguagesWhereLanguage(){
	return CoR.joinCountriesAndLanguagesWhereLanguage();
}
public List<Object[]> countcountries(){
	return CoR.countcountries();
}
public List<Object[]> mexicopop(){
	return CoR.mexicopop();
}
public List<Object[]> precentage(){
	return CoR.precentage();
}
public List<Object[]> surface(){
	return CoR.surface();
}
public List<Object[]> lifecapital(){
	return CoR.lifecapital();
}
public List<Object[]> pop(){
	return CoR.pop();
}
public List<Object[]> region(){
	return CoR.region();
}
}
