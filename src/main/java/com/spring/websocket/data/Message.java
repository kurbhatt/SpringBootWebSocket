package com.spring.websocket.data;

import java.util.ArrayList;
import java.util.List;

public class Message {

    List<String> to = new ArrayList<>();
    private String message;

    public Message() {
    }

    public Message(List<String> to, String message) {
        this.to = to;
        this.message = message;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addUser(String user) {
        this.to.add(user);
    }
}
