package com.juan.productsAndCategories.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.juan.productsAndCategories.models.Product;
import com.juan.productsAndCategories.repositories.ProductRepository;

@Service
public class ProductService {
	
	// Dependecy injects repository to have access to CRUD commands abd findAll methods
	private ProductRepository pRepo;
	
	public ProductService(ProductRepository productRepository) {
		this.pRepo = productRepository;
	}
	
	// Retreive All
	public List<Product> getAllProducts() {
		return this.pRepo.findAll();
	}
	
	// Create
	public Product createProduct(Product newProduct) {
		return this.pRepo.save(newProduct);
	}
	public Product createProduct(String name, String description, int price) {
		Product newProduct = new Product();
		return this.pRepo.save(newProduct);
	}
	
	// Read
	public Product getSingleProduct(Long id) {
		return this.pRepo.findById(id).orElse(null);
	}
	
	//Update
	public Product updateProduct(Product updatedProduct) {
		return this.pRepo.save(updatedProduct);
	}
	
	// Delete
	public void deleteProduct(Long id) {
		this.pRepo.deleteById(id);
	}
}
