package springMvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String welcome() {
		System.out.println("I'm in controller ");
		return "welcome";
	}

}
