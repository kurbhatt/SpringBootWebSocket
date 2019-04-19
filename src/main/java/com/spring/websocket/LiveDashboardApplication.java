package com.spring.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.spring.websocket")
public class LiveDashboardApplication {
	public static void main(String[] args) {
		SpringApplication.run(LiveDashboardApplication.class, args);
	}
}
