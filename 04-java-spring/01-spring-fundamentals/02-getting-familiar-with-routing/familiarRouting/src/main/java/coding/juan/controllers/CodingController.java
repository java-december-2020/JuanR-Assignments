package coding.juan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CodingController {
	
	@RequestMapping(value="/coding", method=RequestMethod.GET)
	public String index() {
		return "Hello Coding Dojo";
	}
	@RequestMapping(value="/coding/python", method=RequestMethod.GET)
	public String python() {
		return "Python/Django was awesome!";
	}
	@RequestMapping(value="/coding/java", method=RequestMethod.GET)
	public String java() {
		return "Java/Spring is better!";
	}
}
