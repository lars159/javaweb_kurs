package se.cronit.message;

import org.springframework.stereotype.Service;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import java.util.Date;

@Service
public class Task {

    @Autowired
    private SimpMessagingTemplate template;

    // this will send a message to an endpoint on which a client can subscribe
    @Scheduled(fixedRate = 5000)
    public void trigger() {
        // sends the message to /topic/message
        this.template.convertAndSend("/topic/message", "Date: " + new Date());
    }
}
