package se.cronit;

import java.util.HashMap;
import java.util.Map;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class UserController {
	
	private BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
	private static UserDB userDB = new UserDB();
	
	
	public void signup(String email, String password){ 
		String encryptedPassword = passwordEncryptor.encryptPassword(email);
		userDB.add(email, encryptedPassword);
	
	}

	public void login(String email, String inputPassword){
		User u = userDB.get(email);
		if (passwordEncryptor.checkPassword(inputPassword, u.getPassword())) { 
			
		} else { 
			
		} 
	}
 
}