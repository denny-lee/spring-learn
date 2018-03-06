package com.example.petservice;

import org.jboss.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@Configuration
//@EnableHystrixDashboard
//@EnableTurbine
//@EnableHystrix
@RestController
public class DemoApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Kitty!";
	}

	@Bean
	Logger.Level feignLoggerLevel() {
		return Logger.Level.DEBUG;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
