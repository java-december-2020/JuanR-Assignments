package com.juan.theCode.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	private String tryCode(@RequestParam(value="code") String code, RedirectAttributes redirectAttributes) {
		String incorrect = "";
		if(code.equals("juan")) {
			return "success.jsp";
			
		} else {
			incorrect = "You must train harder!";
			redirectAttributes.addFlashAttribute("incorrect", incorrect);
			return "redirect:/";
		}
	}
}
