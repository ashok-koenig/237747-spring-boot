package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getAllUsers() {
        return "List of users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable int id){
        return "User detail with id: "+ id;
    }

    @GetMapping("/search")
    public String searchUserByName(@RequestParam String name){
        return "User detail with name: " + name;
    }

    @PostMapping
    public String createUser(@RequestBody String data){
        return "User created with data: "+ data;
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody String data){
        return "User updated with id: "+ id + "and data: "+ data;
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return "User deleted with id: "+ id;
    }

}
