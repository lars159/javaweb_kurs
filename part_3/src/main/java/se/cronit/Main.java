package se.cronit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import se.cronit.sr.SR;
 


@SpringBootApplication
public class Main {

    public static void main(String[] args) throws Exception {
    	
    	RestTemplate restTemplate = new RestTemplate();
        SR quote = restTemplate.getForObject("http://api.sr.se/api/v2/traffic/messages?format=json", SR.class);
        System.out.println(quote.getMessages().get(0).getTitle());
    	
        SpringApplication.run(Main.class, args);
    }
}
