package se.cronit.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import se.cronit.service.CommentService;


@RestController
@RequestMapping("/api/comment")
public class CommentController {
    
    @Autowired
    CommentService commentService;


	@RequestMapping(method=RequestMethod.POST) 
    public void add(@RequestBody String comment) {
        commentService.add(comment);
    }

    @RequestMapping( method=RequestMethod.GET)  
    public List<String> get() {
        return commentService.get();
    }
}
