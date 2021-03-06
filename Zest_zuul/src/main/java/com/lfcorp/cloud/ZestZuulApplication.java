package com.lfcorp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableHystrixDashboard
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class ZestZuulApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ZestZuulApplication.class, args);
		
	}

}
