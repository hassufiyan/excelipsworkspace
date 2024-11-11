package com.xworkz.currency_exchange_services.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.xworkz.currency_exchange_services.entity.CurrencyExchange;
import com.xworkz.currency_exchange_services.reposiotry.CurrencyExchangeRepo;

@RestController
public class CurrnecyExchangeController {

	@Autowired
	private CurrencyExchangeRepo repo;

	@Autowired
	private Environment enivronment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveCurrency(@PathVariable String from, @PathVariable String to) {

		CurrencyExchange currencyExchange = repo.findByFromAndTo(from, to);

		if (currencyExchange == null) {
			throw new RuntimeException("Unable to find data "+ from +" to "+to);
			

		}
		String port = enivronment.getProperty("local.server.port");
		currencyExchange.setEnvironment(port);

		return currencyExchange;

	}

}
