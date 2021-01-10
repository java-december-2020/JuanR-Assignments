package com.juan.dojosAndNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.dojosAndNinjas.models.Dojo;
import com.juan.dojosAndNinjas.services.DojoService;

@RestController
@RequestMapping("/dojo") // Adds /dojo to beginning of any endpoint
public class DojoController {
	@Autowired
	private DojoService dService;
	
	@GetMapping("")
	public String index(Model viewModel) {
		List<Dojo> allDojos = this.dService.getAllDojos();
		viewModel.addAttribute("addDojos", allDojos);
		return "/dojo/index.jsp";
		}

}
