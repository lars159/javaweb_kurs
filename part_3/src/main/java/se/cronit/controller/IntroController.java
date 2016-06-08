package se.cronit.controller;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intro")
public class IntroController {

	@RequestMapping("/test1")
	public String test1(){
		return "test";
	}
	@RequestMapping("/test2") 
	public String test2(){
		return "test2";
	}
 
 
     
}
