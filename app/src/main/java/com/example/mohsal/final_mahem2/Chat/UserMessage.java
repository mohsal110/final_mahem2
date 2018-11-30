package com.example.mohsal.final_mahem2.Chat;

public class UserMessage {

    private String Message,CreatedAt;
    private User Sender;

    public String getCreatedAt() {
        return CreatedAt;
    }

    public String getMessage() {
        return Message;
    }

    public User getSender() {
        return Sender;
    }
}
