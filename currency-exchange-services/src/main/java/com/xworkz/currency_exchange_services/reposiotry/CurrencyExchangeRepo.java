package com.xworkz.currency_exchange_services.reposiotry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xworkz.currency_exchange_services.entity.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange, Long> {

CurrencyExchange	findByFromAndTo(String from,String to);

//here for above method spring will automatically create sql query and prepare everything...
	
}
