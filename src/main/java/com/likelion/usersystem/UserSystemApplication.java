package com.likelion.usersystem;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.Id;

@SpringBootApplication
public class UserSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserSystemApplication.class, args);
		SpringApplication app = null;
		app.setBannerMode(Banner.Mode.OFF);

		// Chạy ứng dụng
		app.run(args);

	}


}
