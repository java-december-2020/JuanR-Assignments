package com.juan.DojoOverFlow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.juan.DojoOverFlow.models.Answer;
import com.juan.DojoOverFlow.services.AnswerService;
import com.juan.DojoOverFlow.services.QuestionService;
import com.juan.DojoOverFlow.services.TagService;

@Controller
@RequestMapping("/answer")
public class AnswerController {
	@Autowired
	private AnswerService aService;
	@Autowired
	private QuestionService qService;
	@Autowired
	private TagService tService;
	
	@GetMapping("/new")
	public String newAnswer(@ModelAttribute("answer")Answer answer) {
		return "newAnswer.jsp";
	}
}
