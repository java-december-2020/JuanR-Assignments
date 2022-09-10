package com.juan.test3.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.test3.models.Course;
import com.juan.test3.models.User;
import com.juan.test3.services.CourseService;
import com.juan.test3.services.UserService;

@Controller
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	private UserService uService;
	@Autowired
	private CourseService cService;
	
	@GetMapping("/new")
	public String addCourse(@ModelAttribute("course") Course course, HttpSession session, Model viewModel) {
		Long userId = (Long)session.getAttribute("user_id");
		viewModel.addAttribute("user_id", userId);
		return "add.jsp";
	}
	
	@PostMapping("/new")
	public String createCourse(@Valid @ModelAttribute("course") Course course, BindingResult result, HttpSession session, Model viewModel) {
		if(result.hasErrors()) {
			Long userId = (Long)session.getAttribute("user_id");
			viewModel.addAttribute("user_id", userId);
			return "add.jsp";
		}
		this.cService.create(course);
		return "redirect:/courses";
	}
	
	@GetMapping("/{id}")
	public String course(@PathVariable("id") Long id, Model viewModel, @ModelAttribute("user") User user, @ModelAttribute("course") Course course, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		viewModel.addAttribute("course", this.cService.getSingleCourse(id));
		viewModel.addAttribute("user", this.uService.findOneUser(userId));
		return "info.jsp";
	}
	

	
	@PostMapping("/edit/{id}")
	public String updateCourse(@Valid @ModelAttribute("course")Course newCourse , BindingResult result, @PathVariable("id")Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("course", this.cService.getSingleCourse(id));
			return "edit.jsp";
		}
		this.cService.updateCourse(newCourse);
		return "redirect:/courses";
	}
	
	@GetMapping("/add/{id}")
	public String add(@PathVariable("id")Long id, HttpSession session) {
		Long UserId = (Long)session.getAttribute("user_id");
		Long CourseId = id;
		User adder = this.uService.findOneUser(UserId);
		Course addedCourse = this.cService.getSingleCourse(CourseId);
		this.cService.addAdder(adder, addedCourse);
		return "redirect:/courses";
	}
	
}
