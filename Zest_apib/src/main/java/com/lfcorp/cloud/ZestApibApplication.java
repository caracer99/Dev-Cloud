package com.lfcorp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
public class ZestApibApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZestApibApplication.class, args);
	}

	@RestController
	@RequestMapping("/apib")
	class ApiController {
		
		@RequestMapping("/")
		String name() {
			return "API -B-";
		}
		
	}
	
}
