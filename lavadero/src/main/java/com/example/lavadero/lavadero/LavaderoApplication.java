package com.example.lavadero.lavadero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class LavaderoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LavaderoApplication.class, args);
	}

}
