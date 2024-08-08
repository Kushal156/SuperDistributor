package com.SuperDistributor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperDistributorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperDistributorApplication.class, args);
		System.out.println("Server connected");
	}

}
