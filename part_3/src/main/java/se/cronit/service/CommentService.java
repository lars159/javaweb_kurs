package se.cronit.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service 
public class CommentService {
	 
	private List<String> comments = new ArrayList<String>();
    
    public void add(String c) {
        comments.add(c);
    }
    
    public List<String> get() {
        return comments;
    }

}
