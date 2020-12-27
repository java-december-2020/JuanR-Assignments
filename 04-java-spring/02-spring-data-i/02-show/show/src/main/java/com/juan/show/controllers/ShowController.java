package com.juan.show.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.juan.show.models.Show;

@Controller
public class ShowController {
	@Autowired
	private ShowService sService;
	
	
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Show> allShows = this.sService.getAllShows();
		viewModel.addAttribute("allShows", allShows);
		return "index.jsp";
	}
	@GetMapping("/add")
	public String addShow(@ModelAttribute("dog")Show show) {
		return "new.jsp";
	}
	@PostMapping("/addShow")
	public String newShow(@RequestParam("name")String name, @RequestParam("language")String language, @RequestParam("numofp")int numofp, RedirectAttributes redirectAttrs) {
		if(name.equals("")) {
			errors.add("Hey there, you forgot to add a name");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
				redirectAttrs.addFlashAttribute("errors", e);
				return "redirect:/";
			}
		}
		this.sService.createShow(name, language, numofp);
		return "redirect:/";
	}
}
