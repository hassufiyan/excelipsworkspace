package com.xworkz.currency_conversion_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.xworkz.currency_conversion_service.entity.CurrencyConversion;

//@FeignClient(name = "currency-exchange", url = "localhost:8000")
@FeignClient(name = "currency-exchange")
public interface Currency_Exchange_Proxy {

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion retrieveCurrency(@PathVariable String from, @PathVariable String to);

}
