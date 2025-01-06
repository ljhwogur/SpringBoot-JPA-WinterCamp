package com.example.controllertest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")	// com.example 아래 모든 패키지 스캔

public class ControllertestApplication {

	public static void main(String[] args) {

		SpringApplication.run(ControllertestApplication.class, args);
	}

}
