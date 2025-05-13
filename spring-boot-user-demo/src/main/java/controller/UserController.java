package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/{name}/{surname}")
    public String addUser(@PathVariable String name, @PathVariable String surname) {
        service.addUser(name, surname);
        return name + " added successfully.";
    }

    @GetMapping("/add/{name}/{surname}")
    public String addUserViaGet(@PathVariable String name, @PathVariable String surname) {
        service.addUser(name, surname);
        return name + " added via GET.";
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable long id) {
        service.getUser(id);
        return "User lookup done. See console.";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable long id) {
        service.removeUser(id);
        return "Delete attempted. See console.";
    }

    @GetMapping("/")
    public String hello() {
        return "Welcome to the Spring Boot User API!";
    }
}
