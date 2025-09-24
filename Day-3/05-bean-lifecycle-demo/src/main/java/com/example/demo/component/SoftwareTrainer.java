package com.example.demo.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SoftwareTrainer implements Trainer{

    SoftwareTrainer(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void initStuff(){
        System.out.println("In initStuff: "+ getClass().getSimpleName());
    }

    @Override
    public String getSubject() {
        return "Java Spring Boot";
    }

    @PreDestroy
    public void cleanupStuff(){
        System.out.println("In cleanupStuff: "+ getClass().getSimpleName());
    }
}
