package com.example.demo.controller;


import com.example.demo.component.Trainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    Trainer trainer;

    Trainer softwareTrainer;

    public DemoController(Trainer trainer){
        this.trainer = trainer;
    }

    @RequestMapping("/")
    public String welcome(){
        return "Working with Dependency Injection";
    }

    @RequestMapping("/subject")
    public String subject(){
        return trainer.getSubject();
    }

    @Autowired
    public void setSoftwareTrainer(@Qualifier("softwareTrainer") Trainer softwareTrainer){
        this.softwareTrainer = softwareTrainer;
    }

    @RequestMapping("/software")
    public String software(){
        return "Software Trainer: "+ softwareTrainer.getSubject();
    }
}
