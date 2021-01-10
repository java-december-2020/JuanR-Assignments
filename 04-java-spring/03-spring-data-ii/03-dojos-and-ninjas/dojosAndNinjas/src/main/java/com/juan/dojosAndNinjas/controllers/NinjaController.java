package com.juan.dojosAndNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.dojosAndNinjas.models.Ninja;
import com.juan.dojosAndNinjas.services.NinjaService;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
	@Autowired
	private NinjaService nService;
	
	@GetMapping("")
	public String index(Model viewModel) {
		List<Ninja>	allNinjas = this.nService.getAllNinjas();
	viewModel.addAttribute("addNinjas", allNinjas);
	return "index.jsp";
	}

}
