package com.chatbot.model;

public class Message {
    private String message;

    public Message(){
    }
    public String getMessage() {
        return message;
    }

    public Message(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}
