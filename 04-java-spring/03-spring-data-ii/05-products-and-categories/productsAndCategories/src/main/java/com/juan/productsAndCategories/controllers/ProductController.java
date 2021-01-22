package com.juan.productsAndCategories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.productsAndCategories.models.Product;
import com.juan.productsAndCategories.services.CategoryService;
import com.juan.productsAndCategories.services.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService pService;
	@Autowired
	private CategoryService cService;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Product> allProducts = this.pService.getAllProducts();
		viewModel.addAttribute("allProducts", allProducts);
		return "index.jsp";
	}
	
	// Routes
	@GetMapping("/new")
	public String addProduct(@ModelAttribute("product")Product product) {
		return "newProduct.jsp";
	}
}
