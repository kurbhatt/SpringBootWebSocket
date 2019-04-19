package com.spring.websocket.controllers;

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
        template.convertAndSend("/topic/msg", message);
        return "success";
    }
}
