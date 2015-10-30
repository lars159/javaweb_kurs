package se.cronit;

import java.util.List;

public class User {
	
	public User(String name, String encryptedPassword) {
		setName(name);
		setPassword(encryptedPassword);
	
	} 
	
	private String name;
	private String password;
	private List<String> Comments;
	
 

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<String> getComments() {
		return Comments;
	}

	public void setComments(List<String> comments) {
		Comments = comments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
