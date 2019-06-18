package com.trading.TradeApp.trade_api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TraderService {
		
	private List<Trader> tradersList = new ArrayList<>();
	@Autowired
	private TraderRepo trepo;
	
	public void registerTrader(@Valid Trader trader) {
			trepo.save(trader);
	}

	public void deleteTraderById(Long id) {
		//tradersList.removeIf(t->t.getId().equals(id));
		trepo.deleteById(id);
	}

	public void deleteTraderByEmail(String email) {
		//tradersList.removeIf(t->t.getEmail().equals(email));
		trepo.deleteTraderByEmail(email);
	}

	public Trader getTraderById(Long id) {
		//return tradersList.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return trepo.findById(id).get();
		
	}

	public Trader getTraderByEmail(String email) {
		//return tradersList.stream().filter(t->t.getEmail().equals(email)).findFirst().get();
		return trepo.findByEmail(email);
	}

	public Collection<TraderDTO> getAllTraders() {
		
		return null;
	}

	public void updateTrader(@Valid UpdatedTraderDTO trader) {
		//tradersList.containsAll(c)
		//trepo.save(trader);
	}

	public void addMoney(@Valid AddMoneyTraderDTO trader) {
		// TODO Auto-generated method stub
		//trepo.save()
	}

}
