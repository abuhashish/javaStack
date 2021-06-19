package com.codingdojo.Language.services;

import java.util.List;
import java.util.Optional;

import com.codingdojo.Language.models.Language;
import com.codingdojo.Language.repositories.LanguageRepository;
import org.springframework.stereotype.Service;
@Service
public class LanguageService {
	private final LanguageRepository languageRepository;

	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}

	// creates a Language
	public Language createLanguage(Language b) {
		return languageRepository.save(b);
	}

	// retrieves a Language
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}

//    public Language updateLanguage(long id,String title,String desc,String lang,int numOfPages) {
//    	
//    }
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}

	public Language updateLanguage(Long id, String name, String creator, String version) {
		Optional<Language> Language = languageRepository.findById(id);
		if (Language.isPresent()) {
			Language.get().setName(name);
			Language.get().setCreator(creator);
			Language.get().setVersion(version);
			languageRepository.save(Language.get());
			return Language.get();
		} else
			return null;
	}

	public void updateLanguage(Language Languages) {
		languageRepository.save(Languages);
	}

}
