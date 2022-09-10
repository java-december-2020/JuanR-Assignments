package com.juan.test3.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.juan.test3.models.Course;
import com.juan.test3.models.User;
import com.juan.test3.services.CourseService;
import com.juan.test3.services.UserService;
import com.juan.test3.validator.UserValidator;

@Controller
public class UserController {
	@Autowired
	private UserService uService;
	@Autowired
	private CourseService cService;
	@Autowired
	private UserValidator validator;
	
	@GetMapping("/")
	public String login(@ModelAttribute("user")User user) {
		return "index.jsp";
	}
	
	@PostMapping("/register")
	public String register(@Valid @ModelAttribute("user")User user, BindingResult result, HttpSession session) {
		validator.validate(user, result);
		if(result.hasErrors()) {
			return "index.jsp";
		}
		User newUser = this.uService.registerUser(user);
		session.setAttribute("user_id", newUser.getId());
		return "redirect:/courses";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("logEmail")String email, @RequestParam("logPassword") String password, RedirectAttributes redirectAttrs, HttpSession session) {
		if(!this.uService.authenticateUser(email, password)) {
			redirectAttrs.addFlashAttribute("loginError", "Cannot Log you in");
			return "redirect:/";
		}
		User user = this.uService.getByEmail(email);
		session.setAttribute("user_id", user.getId());
		return "redirect:/courses";
	}
	
	@GetMapping("/courses")
	public String home(Model viewModel, HttpSession session) {
		Long userId = (Long)session.getAttribute("user_id");
		if(userId == null) {
			return "redirect:/";
		}
		User User = this.uService.findOneUser(userId);
		List<Course> allCourses = this.cService.getAllCourses();
		viewModel.addAttribute("allCourses", allCourses);
		viewModel.addAttribute("user", User);
		return "courses.jsp";
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
}
