package se.cronit;
 
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

@RestController 
public class CalculatorController {
	 
	@Autowired
	CalculatorService cService; 
	
	@RequestMapping("/")
    public int add(Integer a, Integer b) {
        return cService.add(a,b);
    }
	
	
	@ExceptionHandler(NullPointerException.class)
	public String exceptionHandler(NullPointerException e, HttpServletResponse res) {
		res.setStatus(404);
		return "Bad input";
	} 

}
