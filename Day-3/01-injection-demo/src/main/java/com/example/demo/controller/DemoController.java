package com.example.demo.controller;


import com.example.demo.component.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // DI Method 3: Field Injection
//    @Autowired
    Trainer trainer;

    // DI Method 1: Constructor Injection
    public DemoController(Trainer trainer){
        this.trainer = trainer;
    }

    // DI Method 2: Setter Injection
//    @Autowired
//    void setTrainer(Trainer trainer){
//        this.trainer = trainer;
//    }

    @RequestMapping("/")
    public String welcome(){
        return "Working with Dependency Injection";
    }

    @RequestMapping("/subject")
    public String subject(){
        return trainer.getSubject();
    }
}
