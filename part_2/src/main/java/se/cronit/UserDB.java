package se.cronit;

import java.util.HashMap;
import java.util.Map;

public class UserDB {

	private static Map<String, User> users = new HashMap<String, User>();
	
	public void add(String email, String encryptedPassword) {
		users.put(email, new User(email, encryptedPassword));
	}

	public User get(String email) {
		return users.get(email);
		 
	}

}
