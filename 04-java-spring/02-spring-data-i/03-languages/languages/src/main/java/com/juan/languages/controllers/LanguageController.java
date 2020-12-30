package com.juan.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.juan.languages.models.Language;
import com.juan.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService sService;
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Language> allLanguages = this.sService.getAllLanguages();
		viewModel.addAttribute("allLanguages", allLanguages);
		return "index.jsp";
	}
	
	@GetMapping("/add")
	public String addLanguage() {
		return "add.jsp";
	}
	@PostMapping("/addLanguage") 
		public String newLanguage(@RequestParam("name") String name, @RequestParam("creator")String creator, @RequestParam("version")int version) {
			this.sService.createLanguage(name, creator, version);
			return "redirect:/";
		}
	
}
