package se.cronit.sr;

import java.util.List;

public class SR {
	
	private String copyright;
    private List<Message> messages;
    
	public String getCopyright() {
		return copyright;
	}
	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}
	public List<Message> getMessages() {
		return messages;
	}
	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

}
