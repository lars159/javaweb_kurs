package se.cronit;
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
	
	
	@RequestMapping("login/{name}")
    public @ResponseBody boolean login(HttpServletResponse response, HttpSession session, @PathVariable String name, @RequestParam String password) {
        if(db.containsKey(name) && db.get(name).equals(password)) {
        	session.setAttribute("name", name);
        	return true;
        }
        response.setStatus(403);
        return false;
    }

	@RequestMapping(value="signup/{name}", method=RequestMethod.POST)
    public @ResponseBody boolean signup(@PathVariable String name, @RequestParam String password, HttpServletResponse response) {
		if(!db.containsKey(name)) {
			db.put(name, password);
			return true;
		} else {
			response.setStatus(403);
			return false;
		}
    }

    
     
}
