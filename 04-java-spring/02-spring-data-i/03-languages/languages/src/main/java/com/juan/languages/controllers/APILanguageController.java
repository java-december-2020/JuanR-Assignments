package com.juan.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.languages.models.Language;
import com.juan.languages.services.LanguageService;

@RestController
@RequestMapping("/api") // ADDS /API TO THE BEGINNING OF ANY ENDPOINT
public class APILanguageController {
	@Autowired // injects object dependency
	private LanguageService lService;
	
	//ROUTES
	// /api/
	@GetMapping("/")
	public List<Language> allLanguages() {
		return this.lService.getAllLanguages();
	}
	// RETURN SINGLE LANGUAGE BY ID
	// /api/{id}
	@GetMapping("id")
	public Language getoneLanguage(@PathVariable("id")Long id) { // NEED @PATHVARIABLE FOR ID
		return this.lService.getSingleLanguage(id);
	}
	// CREATE DOG BY TAKING INFORMATION FROM THE FRONT END!!!
	@PostMapping("/") // POST MAPPING ALWAYS USED WHEN CREATING NEW OBJECT!!!
	public Language createLanguage(Language newLanguage) {
		return this.lService.createLanguage(newLanguage);
	}
	@PutMapping("/update/{id}") // PUT MAPPING ALWAYS USED WHEN UPDATING OBJECT
	public Language edit(@PathVariable("id")Long id,Language updatedLanguage) {
		return this.lService.updateLanguage(updatedLanguage);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteLanguage(@PathVariable("id")Long id) {
		this.lService.deleteLanguage(id);
	}
}
