package com.lfcorp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ZestConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZestConfigApplication.class, args);
	}

}
