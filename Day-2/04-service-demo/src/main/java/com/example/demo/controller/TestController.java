package com.example.demo.controller;

import com.example.demo.service.CalculationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    CalculationService service;
    // DI - Constructor Dependency injection
    public TestController(CalculationService service){
        this.service = service;
    }

    @RequestMapping("/")
    public String home(){
        return "Working with Controllers and Services";
    }

    @RequestMapping("/total")
    public String total(){
//        CalculationService service = new CalculationService();
        double result = service.totalCost(50, 5, 10);
        return "Total Cost: "+ result;
    }
}
