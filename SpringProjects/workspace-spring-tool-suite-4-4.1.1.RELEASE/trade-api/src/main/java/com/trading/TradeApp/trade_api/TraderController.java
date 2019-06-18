package com.trading.TradeApp.trade_api;
import static java.util.stream.Collectors.toList;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/trading/traders")
public class TraderController {
    @Autowired
    private TraderService traderService;
    
    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public void registerTrader(@RequestBody @Valid Trader trader) {
        traderService.registerTrader(trader);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTraderById(@PathVariable Long id) {
        traderService.deleteTraderById(id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteTraderById(@RequestParam("email") String email) {
        traderService.deleteTraderByEmail(email);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public TraderDTO getTraderById(@PathVariable Long id) {
        return new TraderDTO(traderService.getTraderById(id));
    }
    
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public TraderDTO getTraderByEmail(@RequestParam("email") String email) {
        return new TraderDTO(traderService.getTraderByEmail(email));
    }
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TraderDTO> getAllTraders() {
        return null;
    }
    
    @RequestMapping(method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void updateTrader(@RequestBody @Valid UpdatedTraderDTO trader) {
        traderService.updateTrader(trader);
    }
    
    @RequestMapping(value = "/add", method = RequestMethod.PUT, consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    public void addMoney(@RequestBody @Valid AddMoneyTraderDTO trader) {
        traderService.addMoney(trader);
    }
}
