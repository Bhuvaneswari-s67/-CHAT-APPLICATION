package com.example.websocket_chatApp.controllers;

import com.example.websocket_chatApp.models.Messages;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public Messages sendMessage(
            @Payload Messages Messages
    ) {
        return Messages;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public Messages addUser(
            @Payload Messages Messages,
            SimpMessageHeaderAccessor headerAccessor
    ) {
        // Add username in web socket session
        headerAccessor.getSessionAttributes().put("username",Messages.getSender());
        return Messages;
    }
}
