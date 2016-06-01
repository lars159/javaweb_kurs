package se.cronit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntroController {

	public String text ="";
	@RequestMapping("/add")
	public String add(String t){
		text += t;
		return text;
	}
	
	@RequestMapping(value="/status", method=RequestMethod.POST)
	public String post(){
		return "post ";
	}
	
	
	
}
