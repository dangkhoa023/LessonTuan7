package com.likelion.usersystem.controller;

import com.likelion.usersystem.service.UserService;

public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String username, String password) {

        userService.createUser(username, password);


        System.out.println("User created successfully");
    }
}