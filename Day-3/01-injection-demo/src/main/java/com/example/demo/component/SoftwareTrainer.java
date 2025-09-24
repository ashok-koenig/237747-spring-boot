package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class SoftwareTrainer implements Trainer{
    @Override
    public String getSubject() {
        return "Java Spring Boot";
    }
}
