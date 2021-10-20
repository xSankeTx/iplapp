package com.accelya.iplapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @ComponentScan({ "controller" })
// @EntityScan({"model"})
// @EnableJpaRepositories({"repository"})
public class IplappApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(IplappApplication.class, args);
	}

}
