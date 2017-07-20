package com.foldik.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Queue;

@RestController
public class MessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    private Queue<String> messages;

    @Autowired
    public MessageController(Queue<String> messages) {
        this.messages = messages;
    }

    @PostMapping("/message")
    public String postMessage(@RequestBody String message) {
        LOGGER.info("Received message: {}", message);
        messages.add(message);
        return "OK";
    }

    @PostMapping("/registerTarget")
    public String registerTarget(@RequestBody String targetUrl) {
        return "OK";
    }
}
