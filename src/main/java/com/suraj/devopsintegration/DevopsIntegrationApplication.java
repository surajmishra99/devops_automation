package com.suraj.devopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {
	@GetMapping
	public String message(){return "Welcome to Suraj's Project";}
	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
