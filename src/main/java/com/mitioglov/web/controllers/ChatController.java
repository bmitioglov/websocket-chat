package com.mitioglov.web.controllers;

import com.mitioglov.model.domain.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.security.Principal;

@Controller
public class ChatController {

    @RequestMapping(value = "/chat", method = RequestMethod.GET)
    public String chat() {
        return "chat";
    }

    @RequestMapping(value = "/chat", method = RequestMethod.POST)
    public String chatPost() {
        return "chat";
    }

    @MessageMapping("/chat.message")
    public ChatMessage filterMessage(@Payload ChatMessage message, Principal principal) {

        message.setUsername(principal.getName());

        return message;
    }
}
