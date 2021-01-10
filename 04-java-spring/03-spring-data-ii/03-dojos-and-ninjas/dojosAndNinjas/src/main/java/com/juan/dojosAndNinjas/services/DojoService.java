package com.juan.dojosAndNinjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.dojosAndNinjas.models.Dojo;
import com.juan.dojosAndNinjas.repositions.DojoRepository;

@Service 
public class DojoService {
	// Dependency injects Dojo Repository to have access to crud commands and findAll Methods
	private DojoRepository dRepo;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dRepo = dojoRepository;
	}
	// Retreive All
	public List<Dojo> getAllDojos(){
		return this.dRepo.findAll();
	}
	//Create
	public Dojo createDojo(Dojo newDojo) {
		return this.dRepo.save(newDojo);
	}
	public Dojo createDojo(String name) {
		Dojo newDojo = new Dojo();
		return this.dRepo.save(newDojo);
	}
	// Read
	public Dojo getSingleDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
}
