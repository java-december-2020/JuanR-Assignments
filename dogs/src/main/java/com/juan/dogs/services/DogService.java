package com.juan.dogs.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.dogs.models.Dog;
import com.juan.dogs.models.User;
import com.juan.dogs.repositions.DogRepository;

@Service
public class DogService {
	
	// Dependency injects Dog Repository to have access to CRUD and findAll methods
	private DogRepository dRepo;
	
	public DogService(DogRepository dogRepository) {
		this.dRepo = dogRepository;
	}
	
	// Retreive All
	public List<Dog> getAllDogs(){
		return this.dRepo.findAll();
	}
	
	// Create
	public Dog createDog(Dog newDog) {
		return this.dRepo.save(newDog);
	}
	public Dog createDog(String name, String breed, int age) {
		Dog newDog = new Dog(name, breed, age);
		return this.dRepo.save(newDog);
	}
	
	// Read
	public Dog getSingleDog(Long id) {
		return this.dRepo.findById(id).orElse(null);
	}
	
	
	// Update
	public Dog updateDog(Dog updatedDog) {
		return this.dRepo.save(updatedDog);
	}
	
	
	// Delete
	public void deleteDog(Long id) {
		this.dRepo.deleteById(id);
	}
	
	// Add Liker to database
	public void addLiker(User user, Dog dog) {
	// Get The list from the dog objet
		List<User> likers = dog.getLikers();
	// Add the liker
		likers.add(user);
	// Updat the database
		this.dRepo.save(dog);
	}
	
	
	// REMOVE LIKER FROM DATABASE!
	// Add Liker to database
	public void removeLiker(User user, Dog dog) {
	// Get The list from the dog objet
		List<User> likers = dog.getLikers();
	// Remove the liker
		likers.remove(user);
	// Updat the database
		this.dRepo.save(dog);
	}
	
}
