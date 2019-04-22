package com.spring.websocket.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.spring.websocket.data.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class DataController {

    @Autowired
    SimpMessagingTemplate template;

    @GetMapping("/send")
    public String sendSomething(Model model, @RequestParam("message") String message) {
        List<Message> dataToSend = new ArrayList<>();
        Message message1 = new Message();
        message1.addUser("keyur");
        message1.addUser("user");
        message1.addUser("user1");
        dataToSend.add(new Message(Collections.singletonList("keyur"), "for only keyur,"));
        dataToSend.add(new Message(Collections.singletonList("user"), "for only user,"));
        dataToSend.add(new Message(Collections.singletonList("user1"), "for only user1,"));
        message1.setMessage("sab ko msg milega");
        dataToSend.add(message1);

        for(Message msg : dataToSend) {
            for(String s: msg.getTo()) {
                template.convertAndSendToUser(s,"/msg", msg.getMessage());
            }
        }
        return "success";
    }
}
