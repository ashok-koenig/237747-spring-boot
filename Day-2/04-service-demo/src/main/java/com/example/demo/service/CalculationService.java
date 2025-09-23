package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public double totalCost(double price, double quantity, double discount){
        return (price * quantity) - discount;
    }
}
