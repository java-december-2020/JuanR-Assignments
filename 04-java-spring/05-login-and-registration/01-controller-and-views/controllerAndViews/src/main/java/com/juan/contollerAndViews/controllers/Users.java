package com.juan.contollerAndViews.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Users {
    private final UserService userService;
    
    public Users(UserService userService) {
        this.userService = userService;
    }
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
    	if(result.hasErrors()) {
    		return "registrationPage.jsp";
    	}
        // else, save the user in the database, save the user id in session, and redirect them to the /home route
    	User newUser = this.userService.registerUser(user);
    	session.setAttribute("user_id", newUser.getId());
    	return "redirect:/home";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
		User user = this.uService.getByEmail(email);
		session.setAttribute("user_id", user.getId());
		return "redirect:/dashboard";
        // else, add error messages and return the login page
		if(!this.uService.authenticateUser(email, password)) {
			redirectAttrs.addFlashAttribute("loginError", "Invalid Credentials");
			return "redirect:/";
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
    	viewModel.addAttribute("user", this.userService.findOneUser(id));
    	return "homePage.jsp";
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
    	session.invalidate();
        // redirect to login page
    	return "redirect:/loginPage.jsp";
    }
}
