package com.juan.displayDateControllers;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ComponentScan(basePackages= {"com.juan.displayDateControllers"})
public class DateController {
	@GetMapping("/index")
	public String index() {
		return "index.jsp";
	}
	@GetMapping("/viewTime")
	public String time() {
	LocalDateTime now = LocalDateTime.now();
	return "viewTime.jsp";
	}
	@GetMapping("/viewDate")
	public String date() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E MMM dd yyyy");
		return "viewDate.jsp";
	}
}
