package com.lfcorp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


@SpringBootApplication
@EnableCircuitBreaker
public class ZestApiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZestApiaApplication.class, args);
	}
	
}
