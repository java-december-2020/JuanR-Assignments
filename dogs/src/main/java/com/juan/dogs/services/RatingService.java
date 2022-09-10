package com.juan.dogs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.dogs.models.Rating;
import com.juan.dogs.repositions.RatingRepository;

@Service
public class RatingService {
	@Autowired
	private RatingRepository rRepo;
	
	public void createRating(Rating rating) {
		this.rRepo.save(rating);
	}
}
