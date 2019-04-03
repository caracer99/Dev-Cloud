package com.lfcorp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ZestEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZestEurekaApplication.class, args);
	}

}
