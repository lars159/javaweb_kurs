package se.cronit;

import java.util.HashMap;
import java.util.Map;

import org.jasypt.util.password.BasicPasswordEncryptor;

public class UserController {
	
	private BasicPasswordEncryptor passwordEncryptor = new BasicPasswordEncryptor();
	private static Map<String, User> userDB = new HashMap<String, User>();
	
	
	public void signup(String email, String password){ 
		String encryptedPassword = passwordEncryptor.encryptPassword(email);
		userDB.put(email, encryptedPassword);
	
	}

	public void login(String email, String inputPassword){
		String encryptedPassword = userDB.get(email);
		if (passwordEncryptor.checkPassword(inputPassword, encryptedPassword)) { 
			
		} else { 
			
		} 
	}
 
}