package com.lfcorp.cloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class CloudService {

	@HystrixCommand(fallbackMethod = "defaultNaver")
	public String getNaver() {
		return new RestTemplate().getForObject("http://121.50.22.44:9305/api/aumall/search", String.class);
	}
	private String defaultNaver() {
		return "Hello Naver~";
	}
	
}
