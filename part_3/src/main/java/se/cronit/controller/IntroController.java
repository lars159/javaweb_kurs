package se.cronit.controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/intro")
public class IntroController {

	//REMOVE
	
	public static Map<String, String> db = new HashMap<String, String>();
	
	
	@RequestMapping("login")
    public login(HttpSession session, String name, String password) {
        if(name.equals("admin) && password.equals("admin")) {
        	session.setAttribute("name", name);
        	return true;
        }
        response.setStatus(403);
        return false;
    }
     
}
