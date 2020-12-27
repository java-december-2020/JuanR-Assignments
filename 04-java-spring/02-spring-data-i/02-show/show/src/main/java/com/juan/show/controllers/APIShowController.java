package com.juan.show.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.show.models.Show;

@RestController
@RequestMapping("/api") // Adds /api to the beginning of any endpoint
public class APIShowController {
	@Autowired
	private ShowService sService;
	
	//Routes
	// api/
	@GetMapping("/")
	public List<Show> allShows() {
		return this.sShow.getAllShows();
	}
	// Return single Show by ID
	// /api/{id}
	@GetMapping("(id)")
	public Show getOneShow(@PathVariable("id")Long id) {
		return this.sShow.geteSingleShow(id);
	}
	// Create Show by taking information from frontend
	@PostMapping("/")
	public Show create(Show newShow) {
		return this.sService.createShow(newShow);
		
	}
	//Update Show
	@PutMapping("/update{id}")
	public Show edit(@PathVariable("id")Long id, Show updateShow) {
		return this.sService.updateShow(updateShow);
	}
	// Delete Dog by ID
	@DeleteMapping("/delete/{id}")
	public void deleteShow(@PathVariable("id")Long id) {
		this.sService.deleteShow(id);
	}
}
