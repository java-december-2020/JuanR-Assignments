package com.juan.dojoSurvey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@GetMapping(value="/result")
	public String result() {
		return "result.jsp";
	}
}
