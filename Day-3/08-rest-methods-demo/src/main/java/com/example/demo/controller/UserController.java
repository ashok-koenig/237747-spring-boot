package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "List of users";
    }

    @PostMapping
    public String createUser(){
        return "User created";
    }

    @PutMapping
    public String updateUser(){
        return "User updated";
    }

    @DeleteMapping
    public String deleteUser(){
        return "User deleted";
    }

}
