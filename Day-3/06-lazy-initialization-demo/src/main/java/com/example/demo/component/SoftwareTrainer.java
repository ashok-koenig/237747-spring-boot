package com.example.demo.component;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class SoftwareTrainer implements Trainer{

    SoftwareTrainer(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getSubject() {
        return "Java Spring Boot";
    }
}
