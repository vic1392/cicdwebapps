package com.example.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "<html><body><h1>Hello from CICD Pipeline!</h1><p>Service: cicd-webapp</p></body></html>";
    }
}

