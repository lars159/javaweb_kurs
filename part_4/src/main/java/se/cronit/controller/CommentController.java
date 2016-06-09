package se.cronit.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*; 

@RestController
@RequestMapping("api/comment")
public class CommentController {
    
    List<Comment> list = new ArrayList<Comment>();
    
	@RequestMapping(  method=RequestMethod.POST)
    public void add(Comment c) {
        list.add(c);
    }
    
    @RequestMapping( method=RequestMethod.PUT)
    public void update(Comment c) {
        list.add(c);
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Comment get(@PathVariable int id) {
        return list.get(id);
    }
    
    @RequestMapping(  method=RequestMethod.GET)
    public List<Comment> getAll() {
        return list;
    }
}
