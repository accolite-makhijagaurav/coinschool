package com.accolite.coinexchange.coinschool.controller;

import com.accolite.coinexchange.coinschool.model.Coin;
import com.accolite.coinexchange.coinschool.service.CoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoinController {

    @Autowired
    private CoinService coinService;

    @PostMapping("/coin")
    public Coin listCoin(@RequestBody Coin coin){
        return coinService.listCoin(coin);
    }

    @GetMapping("/coin/listed")
    public List<Coin> getAllListedCoins(){
        return coinService.getListedCoins();
    }

    @PostMapping("/coin/delist")
    public long delistCoin(@RequestBody Coin coin){
        return coinService.delistCoin(coin.getId());

    }


}
