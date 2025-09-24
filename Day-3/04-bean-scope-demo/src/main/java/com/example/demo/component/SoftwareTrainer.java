package com.example.demo.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")  // Create object for every injection
public class SoftwareTrainer implements Trainer{
    @Override
    public String getSubject() {
        return "Java Spring Boot";
    }
}
