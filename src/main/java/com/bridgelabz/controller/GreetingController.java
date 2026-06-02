package com.bridgelabz.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public Map<String,String> getGreeting() {

        Map<String,String> response = new HashMap<>();
        response.put("message","Hello World");
        response.put("method","GET");

        return response;
    }

    @PostMapping
    public Map<String,String> postGreeting() {

        Map<String,String> response = new HashMap<>();
        response.put("message","Hello World");
        response.put("method","POST");

        return response;
    }

    @PutMapping
    public Map<String,String> putGreeting() {

        Map<String,String> response = new HashMap<>();
        response.put("message","Hello World");
        response.put("method","PUT");

        return response;
    }

    @DeleteMapping
    public Map<String,String> deleteGreeting() {

        Map<String,String> response = new HashMap<>();
        response.put("message","Hello World");
        response.put("method","DELETE");

        return response;
    }
}