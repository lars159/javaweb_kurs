package se.cronit.controller;
 

import javax.servlet.http.HttpServletResponse;

import org.jasypt.util.password.BasicPasswordEncryptor; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import se.cronit.db.User;
import se.cronit.db.UserDB;

@RestController
@RequestMapping("/user")
public class UserController {
 

	@RequestMapping("/login/{name}")
	public User login(HttpServletResponse response, @PathVariable String name, @RequestParam String password){
 
	}
 
}