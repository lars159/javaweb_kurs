package se.cronit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import se.cronit.sr.SR;
 


@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {
    	
        SpringApplication.run(Main.class, args);
    }
}
