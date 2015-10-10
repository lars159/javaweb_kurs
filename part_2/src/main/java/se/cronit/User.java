package se.cronit;

import java.util.List;

public class User {
	
	public User(String mail, String encryptedPassword) {
		setEmail(mail);
		setPassword(encryptedPassword);
	
	} 
	
	private String email;
	private String password;
	private List<String> Comments;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

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



}
