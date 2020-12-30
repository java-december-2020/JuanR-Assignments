package com.juan.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.languages.models.Language;
import com.juan.languages.repository.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.lRepo = languageRepository;
	}
	
	// RETREIVE ALL
	public List<Language> getAllLanguages(){
		return this.lRepo.findAll();
	}
	
	// CREATE
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	
	public Language createLanguage(String name, String creator, int version) { // STEP 25
		Language newLanguage = new Language(name, creator, version);
		return this.lRepo.save(newLanguage);
	}
	
	// READ
	public Language getSingleLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	// UPDATE
	public Language updateLanguage(Language updateLanguage) {
		return this.lRepo.save(updateLanguage);
	}
	
	
	// DELETE
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}
