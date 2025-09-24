package com.example.demo.component;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HardwareTrainer implements Trainer{

    HardwareTrainer(){
        System.out.println("In Constructor: "+ getClass().getSimpleName());
    }

    @Override
    public String getSubject() {
        return "Hardware and Networking";
    }
}
