package com.likelion.usersystem.appconfig;

import com.likelion.usersystem.controller.UserController;
import com.likelion.usersystem.repository.UserRepository;
import com.likelion.usersystem.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AConfig {
    @Bean
    public UserRepository userRepository() {
        return new UserRepository();
    }

    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserService(userRepository);
    }

    @Bean
    public UserController userController(UserService userService) {
        return new UserController(userService);
    }
}
