package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${my.name}")
    private String myName;

    @RequestMapping("/")
    public String welcome(){
        return "Welcome to "+ myName;
//        return "Welcome to Spring Boot";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello from Spring boot";
    }
}
