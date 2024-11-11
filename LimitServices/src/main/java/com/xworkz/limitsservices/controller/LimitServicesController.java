package com.xworkz.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.limitsservices.bean.Limits;
import com.xworkz.limitsservices.configuration.LimitsConfig;

@RestController
public class LimitServicesController {
	
	@Autowired
	private LimitsConfig limitConfig;

	@GetMapping("/limits")
	public Limits retrieveLimits() {
		
//		return new Limits(1,1000);
	
return new Limits(limitConfig.getMinimum(),limitConfig.getMaximum());
	}
	
	
}
