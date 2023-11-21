package com.likelion.usersystem.Service;

import com.likelion.usersystem.Repository.UserRepository;


public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(String username, String password) {

        System.out.println("Creating user: " + username + " with password: " + password);


    }
}