package com.example.demo.controller;

import com.example.demo.model.Employee;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String showForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        String[] departments = {"IT", "Admin", "HR"};
        model.addAttribute("departments", departments);
        return "employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@Valid @ModelAttribute Employee employee, BindingResult result, Model model){

        if(result.hasErrors()){
            String[] departments = {"IT", "Admin", "HR"};
            model.addAttribute("departments", departments);
            return "employee-form";
        }

        model.addAttribute("employee", employee);
        return "employee-success";
    }
}
