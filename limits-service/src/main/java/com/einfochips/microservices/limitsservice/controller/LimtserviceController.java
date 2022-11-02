package com.einfochips.microservices.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.einfochips.microservices.limitsservice.beans.Limits;
import com.einfochips.microservices.limitsservice.config.Configuration;

@RestController
public class LimtserviceController {
	
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public Limits retriveLimits()
	{
		return new Limits(configuration.getMaximum(),configuration.getMinimum());
	}

}
