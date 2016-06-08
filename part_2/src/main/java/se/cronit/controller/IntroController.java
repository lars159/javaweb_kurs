package se.cronit.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/date")
public class IntroController {

 
	
	@RequestMapping( method=RequestMethod.GET)
	public String get(){
		return new Date().toString();
	}
	
	
	
}
