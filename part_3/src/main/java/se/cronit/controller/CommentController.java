package se.cronit.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/comment")
public class CommentController {
    
	@RequestMapping(value="/add", method=RequestMethod.POST)
    public void add(HttpServletRequest req, @RequestBody String comment) {
 
    }
}
