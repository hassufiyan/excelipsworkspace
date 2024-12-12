package com.xworkz.limitsservices.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@ConfigurationProperties("limits-services")
@Service
public class LimitsConfig {
	
	private int minimum;
	private int maximum;
	
	public LimitsConfig() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitsConfig(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	@Override
	public String toString() {
		return "LimitsConfig [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	
	
	
	

}
