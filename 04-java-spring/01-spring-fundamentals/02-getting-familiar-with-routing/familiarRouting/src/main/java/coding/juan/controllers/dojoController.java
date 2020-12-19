package coding.juan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class dojoController {
	@RequestMapping(value="/dojo", method=RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/dojo/burbank", method=RequestMethod.GET)
	public String burbank() {
		return "burbank.jsp";
	}
	@RequestMapping(value="/dojo/sanjose", method=RequestMethod.GET)
	public String sanjo() {
		return "sanjo.jsp";
	}
}
