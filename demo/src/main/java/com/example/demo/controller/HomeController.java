package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    public ResponseEntity<?> home(){
        return ResponseEntity.ok("hello world");
    }
}
