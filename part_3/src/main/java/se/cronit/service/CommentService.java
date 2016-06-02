package se.cronit.service;


import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import java.util.*;


@Service 
public class CommentService {
	 
	List<String> comments = new ArrayList<String>();
    
    public void add(String c) {
        comments.add(c);
    }
    
    public List<String> get() {
        return comments;
    }

}
