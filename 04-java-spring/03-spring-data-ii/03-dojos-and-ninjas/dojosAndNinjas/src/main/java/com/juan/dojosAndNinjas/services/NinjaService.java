package com.juan.dojosAndNinjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.dojosAndNinjas.models.Ninja;
import com.juan.dojosAndNinjas.repositions.NinjaRepository;

@Service
public class NinjaService {
	// Dependency injects Ninja Repo to have access to CRUD commands and findAll Methods
	private NinjaRepository nRepo;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.nRepo = ninjaRepository;
	}
	
	//Retreive All
	public List<Ninja> getAllNinjas(){
		return this.nRepo.findAll();
	}
	//Create
	public Ninja createNinja(Ninja newNinja) {
		return this.nRepo.save(newNinja);
	}
	public Ninja createNinja(String firstName, String lastName, int age) {
		Ninja newNinja = new Ninja();
		return this.nRepo.save(newNinja);
	}
}
