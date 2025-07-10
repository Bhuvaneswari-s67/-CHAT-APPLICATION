package com.example.websocket_chatApp.config;


import com.example.websocket_chatApp.models.Messages;
import com.example.websocket_chatApp.models.MsgType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

    @Component
    @Slf4j
    @RequiredArgsConstructor
    public class WebSocketEvent {

        private final SimpMessageSendingOperations messagingTemplate;

        @EventListener
        public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
            StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
            String username = (String) headerAccessor.getSessionAttributes().get("username");
            if (username != null) {
                log.info("user disconnected: {}", username);
                var ChatMessage = Messages.builder()
                        .msgType(MsgType.LEAVE)
                        .sender(username)
                        .build();
                messagingTemplate.convertAndSend("/topic/public",ChatMessage);
            }
        }

    }
