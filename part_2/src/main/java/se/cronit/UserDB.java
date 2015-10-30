package se.cronit;

import java.util.HashMap;
import java.util.Map;

public class UserDB {

	private static Map<String, User> users = new HashMap<String, User>();
	
	public static void add(String name, String encryptedPassword) {
		users.put(name, new User(name, encryptedPassword));
	}

	public static User get(String name) {
		return users.get(name);
		 
	}

}
