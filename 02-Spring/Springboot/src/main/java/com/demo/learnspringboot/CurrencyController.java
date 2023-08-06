package com.demo.learnspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	@Autowired
	private CurrencyServiceConfig config;
	
	@RequestMapping("/currency-config")
	public CurrencyServiceConfig retrieveConfig() {
		return config;
	}
}
