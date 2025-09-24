package com.example.demo.controller;

import com.example.demo.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    List<User> users;

    UserController(){
        users = new ArrayList<>();
        users.add(new User(1, "John", "john@email.com"));
        users.add(new User(2, "Smith", "smith@email.com"));
    }

    @GetMapping
    public List<User> getAllUsers(){
        return users;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        users.add(user);
        return user;
    }
}
