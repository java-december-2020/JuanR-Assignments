package com.juan.productsAndCategories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.juan.productsAndCategories.models.Category;
import com.juan.productsAndCategories.services.CategoryService;
import com.juan.productsAndCategories.services.ProductService;

@Controller
@RequestMapping("/categories")
public class CategoryController {
	@Autowired
	private CategoryService cService;
	@Autowired
	private ProductService pSerivce;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Category> allCategories = this.cService.getAllCategories();
		viewModel.addAttribute("allCategories", allCategories);
		return "index.jsp";
	}
	
	// Routes
	@GetMapping("/new")
	public String addCategory(@ModelAttribute("category")Category category) {
		return "newCategory.jsp";
	}
	
	@PostMapping("/addCategory")
	public String newCategory(@RequestParam("name")String name, RedirectAttributes redirect) {
		this.cService.createCategory(name);
		return "redirect:/";
	}
}
