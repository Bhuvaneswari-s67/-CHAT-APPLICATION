package com.example.websocket_chatApp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Messages {

        private String sender;
        private String content;
        private MsgType msgType;

}

