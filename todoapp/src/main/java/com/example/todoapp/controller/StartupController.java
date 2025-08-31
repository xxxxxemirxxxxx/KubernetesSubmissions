package com.example.todoapp.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartupController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String home() {
        return "Todo App - Server running on port " + port;
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/status")
    public String status() {
        return "Server is running on port " + port;
    }

}
