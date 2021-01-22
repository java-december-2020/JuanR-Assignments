package com.juan.productsAndCategories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.productsAndCategories.models.Category;
import com.juan.productsAndCategories.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository cRepo;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.cRepo = categoryRepository;
	}
	
	// Retreive All
	public List<Category> getAllCategories() {
		return this.cRepo.findAll();
	}
	
	// Create
	
	public Category createCategory(Category category) {
		return this.cRepo.save(category);
	}
	public Category createCategory(String name) {
		Category newCategory = new Category();
		return this.cRepo.save(newCategory);
	}
	
	// Read
	public Category getSingleCategory(Long id) {
		return this.cRepo.findById(id).orElse(null);
	}
	
	// Update
	public Category updatedCategory(Category updatedCategory) {
		return this.cRepo.save(updatedCategory);
	}
	
}
