package com.trading.TradeApp.trade_api;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TraderRepo extends CrudRepository<Trader, Long> {
	@Query("delete from Trader u where u.email = ?1")
    void deleteTraderByEmail(String email);
	Trader findByEmail(String email);
}
