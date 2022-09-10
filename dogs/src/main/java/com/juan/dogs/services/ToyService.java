package com.juan.dogs.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.dogs.models.Dog;
import com.juan.dogs.models.Toy;
import com.juan.dogs.repositions.ToyRepository;

@Service
public class ToyService {
	@Autowired
	private ToyRepository tRepo;
	
	// Create
	public Toy create(Toy toy) {
		return this.tRepo.save(toy);
	}
	
	// Read
	public Toy getSingleToy(Long id) {
		return this.tRepo.findById(id).orElse(null);
	}
}
