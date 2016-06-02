package se.cronit.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import java.security.Principal;


@RestController
@RequestMapping("/comment")
public class CommentController {
    
    @Autowired
    CommentService commentService;
    
	@RequestMapping(method=RequestMethod.POST)
    public void add(@RequestBody String comment) {
        commentService.add(comment);
    }
    
    @RequestMapping(value="/", method=RequestMethod.GET)
    public List<String> get() {
        return commentService.get();
    }
}
