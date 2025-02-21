package com.capgemini.spring_intro2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello from bridgelabz", HttpStatus.OK);
    }

    @GetMapping("/hello1")
    public String hello(Model model) {
        model.addAttribute("message", "Hello, Thymeleaf!");
        return "hello"; // Refers to hello.html template
    }

    @GetMapping("/hello2")
    public ResponseEntity<String> hello2(){
        return new ResponseEntity<>("Hello from bridgelabz", HttpStatus.OK);
    }
}
