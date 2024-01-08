package com.example.demo.controller;

import com.example.demo.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {
    @RequestMapping(value = "/message", method = {RequestMethod.GET, RequestMethod.POST})
    Message handleRequests(@RequestBody(required = false) Message mess){
        if (mess != null) {
            // If a message is provided in the request body, echo it
            return mess;
        } else {
            // If no message is provided, return a default message
            return new Message("Default Message");
        }
    }
}

