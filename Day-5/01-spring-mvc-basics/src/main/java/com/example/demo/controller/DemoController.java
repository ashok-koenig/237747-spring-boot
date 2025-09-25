package com.example.demo.controller;

import com.example.demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String showHome(){
        return "home";
    }

    @RequestMapping("/about")
    public String showAbout(Model model){
        model.addAttribute("first_name", "John");
        model.addAttribute("last_name", "Smith");
        model.addAttribute("age", 25);

        String[] friends = {"Smith", "Ana", "Bob"};
        model.addAttribute("friends", friends);

        Person person = new Person("Peter", "peter@email.com", 12345);
        model.addAttribute("person", person);

        Person[] employees = {
                new Person("John", "john@email.com", 34567),
                new Person("Smith", "smith@email.com", 56778),
                new Person("Bob", "bob@email.com", 87766),
                new Person("Ana", "ana@email.com", 45678)
        };

        model.addAttribute("employees", employees);

        return "about";
    }
}
