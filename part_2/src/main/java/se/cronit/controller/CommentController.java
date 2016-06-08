package se.cronit.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/comment")
public class CommentController {

	public static List<String> list = new ArrayList<String>();
	
	
	@RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<String> getAll() {
        return list;
    }

	@RequestMapping(value = "/{id}")
    public @ResponseBody String get(@PathVariable int id) {
        return list.get(id);
    }
    
	@RequestMapping(method=RequestMethod.POST)
    public void add(@RequestBody String comment) {
        list.add(comment);
    }
    
     
}
