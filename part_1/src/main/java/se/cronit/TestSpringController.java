package se.cronit;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpringController {

	@RequestMapping("/status")
	public String status(@RequestParam String test){
		return test;
	}
	
	@RequestMapping(value="/status", method=RequestMethod.POST)
	public String post(){
		return "post ";
	}
	
	
	
}
