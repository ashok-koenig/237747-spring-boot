package com.example.demo.component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class SoftwareTrainer implements Trainer{

    private Logger logger = LoggerFactory.getLogger(SoftwareTrainer.class);

    SoftwareTrainer(){
        logger.info("In Constructor");
//        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    @PostConstruct
    public void initStuff(){
        logger.info("In initStuff");
//        System.out.println("In initStuff: "+ getClass().getSimpleName());
    }

    @Override
    public String getSubject() {
        return "Java Spring Boot";
    }

    @PreDestroy
    public void cleanupStuff(){
        logger.warn("In cleanupStuff: App Shutting down");
//        System.out.println("In cleanupStuff: "+ getClass().getSimpleName());
    }
}
