package com.lfcorp.cloud.zest_turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
@EnableEurekaClient
public class ZestTurbineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZestTurbineApplication.class, args);
	}

}
