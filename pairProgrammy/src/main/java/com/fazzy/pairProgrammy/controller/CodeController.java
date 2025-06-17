package com.fazzy.pairProgrammy.controller;


import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class CodeController {

    @MessageMapping("/code.send/{roomId}")
    @SendTo("/topic/code/{roomId}")
    public Message sendCode(@DestinationVariable String roomId, @Payload Message message) {
        return message;
    }

    public static class Message {
        private String content;

        public Message() {}
        public Message(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}