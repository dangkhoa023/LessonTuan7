package com.likelion.usersystem.AppConfig;

import com.likelion.usersystem.Controller.UserController;
import com.likelion.usersystem.Repository.UserRepository;
import com.likelion.usersystem.Service.UserService;
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
