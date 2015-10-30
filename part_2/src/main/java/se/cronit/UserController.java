package se.cronit;
 

import javax.servlet.http.HttpServletResponse;

import org.jasypt.util.password.BasicPasswordEncryptor; 
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
	private static UserDB userDB = new UserDB();
	
	@RequestMapping("/signup/{name}")
	public void signup(HttpServletResponse response, @PathVariable String name, @RequestParam String password){ 
		String encryptedPassword = passwordEncryptor.encryptPassword(name);
		userDB.add(name, encryptedPassword);
	
	}

	@RequestMapping("/login/{name}")
	public User login(HttpServletResponse response, @PathVariable String name, @RequestParam String password){
		User u = userDB.get(name);
		if (passwordEncryptor.checkPassword(password, u.getPassword())) { 
			return u;
		} else { 
			response.setStatus(401);
			return null;
		} 
	}
 
}