package se.cronit.message;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/message")
public class Task {

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping
    public void send() {
        // sends the message to /topic/message 
        this.template.convertAndSend("/topic/messages", "Date: " + new Date());
    }
}
