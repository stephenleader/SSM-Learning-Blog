package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class formaltestController {

    @GetMapping("/hello")
    public String hello(){
        return "hello,my friend";
    }

}
