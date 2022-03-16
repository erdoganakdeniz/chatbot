package com.chatbot.controller;

import com.chatbot.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Random;

@Controller
@CrossOrigin
public class MessageController {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void getMessage(@Payload Message message) {
        System.out.println(message.toString());
        Random rnd=new Random();
        int random=rnd.nextInt(2)+1;
        switch (random){
            case 1:
                messagingTemplate.convertAndSend("/topic","Hi, Welcome to our company, we are here to assist you. Please contact us on: test@test.com");
                break;
            case 2:
                messagingTemplate.convertAndSend("/topic","Hi, we are here to assist you Please contact us on: test@test.com");
                break;
        }

          }

}
