package com.lfcorp.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lfcorp.cloud.service.CloudService;

@RestController
public class CloudController {

	@Autowired
	private CloudService service;
	
	@RequestMapping("/test")
	String name() {
		
		return "API -A- 1<br/><br/>" + service.getNaver();
		
	}
	
}
