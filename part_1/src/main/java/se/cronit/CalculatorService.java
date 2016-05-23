package se.cronit;


import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;


@Service 
public class CalculatorService {
	 
	 
    public int add(int a, int b) {
        return a+b;
    }

}
