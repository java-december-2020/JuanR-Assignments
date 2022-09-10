package com.juan.show.service;

import java.util.List;

import com.juan.show.models.Show;
import com.juan.show.repositions.ShowRepository;

public class ShowService {
	private ShowRepository sService;
	
	public ShowService(ShowRepository showRepository) {
		this.sService = showRepository;
	}
	public List<Show> getAllShows() {
		return this.sService.findAll();
	}
	public ShowRepository getsService() {
		return sService;
	}
	// Create
	public Show createShow(Show newShow) {
		return this.dRepo
	}
	
}