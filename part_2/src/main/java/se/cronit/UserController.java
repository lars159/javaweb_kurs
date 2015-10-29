package se.cronit;
 

import org.jasypt.util.password.BasicPasswordEncryptor; 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
	private static UserDB userDB = new UserDB();
	
	@RequestMapping("signup")
	public void signup(@RequestParam String email, @RequestParam String password){ 
		String encryptedPassword = passwordEncryptor.encryptPassword(email);
		userDB.add(email, encryptedPassword);
	
	}

	@RequestMapping("login")
	public User login(@RequestParam String email, @RequestParam String inputPassword){
		User u = userDB.get(email);
		if (passwordEncryptor.checkPassword(inputPassword, u.getPassword())) { 
			return u;
		} else { 
			return null;
		} 
	}
 
}