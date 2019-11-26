package com.sparta.jm.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/hello")
    public String greeting(){
        return "Hello Spring Boot World";
    }

}
