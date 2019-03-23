package com.initiative.quickloan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// Test Comment 2
// Test Comment 1
// Test Comment 3
@SpringBootApplication
@ComponentScan("com.initiative.quickloan.config")
public class QuickloanApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuickloanApplication.class, args);
	}
}
