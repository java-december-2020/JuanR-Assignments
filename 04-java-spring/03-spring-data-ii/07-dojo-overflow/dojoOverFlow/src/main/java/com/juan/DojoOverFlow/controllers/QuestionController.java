package com.juan.DojoOverFlow.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.DojoOverFlow.models.Question;
import com.juan.DojoOverFlow.services.AnswerService;
import com.juan.DojoOverFlow.services.QuestionService;

@Controller
@RequestMapping("/questions") // Adds /questions to end of url
public class QuestionController {
	@Autowired
	private QuestionService qService;
	@Autowired
	private AnswerService aService;
	
	// Routes
	@GetMapping("/")
	public String index(Model viewModel) {
		List<Question> allQuestions = this.qService.getAllQuestions();
		viewModel.addAttribute("allQuestions", allQuestions);
		return "index.jsp";
	}
	
	@GetMapping("/new")
	public String newQuestion(@ModelAttribute("question") Question question) {
		return "newQuestion.jsp";
	}
	@PostMapping("/addQuestion")
	public String addQuestion(@Valid @ModelAttribute("question")Question question, BindingResult result, Model viewModel) {
		this.qService.createQuestion(question);
		return "redirect:/";
	}
}
