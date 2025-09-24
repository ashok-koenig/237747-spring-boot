package com.example.demo.controller;


import com.example.demo.component.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Trainer trainer;
    Trainer anotherTrainer;

    public DemoController(Trainer trainer, Trainer anotherTrainer){
        this.trainer = trainer;
        this.anotherTrainer = anotherTrainer;
    }

    @RequestMapping("/check")
    public String check(){
        return "Comparing Beans: trainer == anotherTrainer: " + (trainer == anotherTrainer);
    }

    @RequestMapping("/")
    public String welcome(){
        return "Working with Dependency Injection";
    }

    @RequestMapping("/subject")
    public String subject(){
        return trainer.getSubject();
    }
}
