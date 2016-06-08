package se.cronit.controller;
import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    
    @RequestMapping(method=RequestMethod.GET)
    public Principal login(Principal user) {
	    return user;
	}
      
}
