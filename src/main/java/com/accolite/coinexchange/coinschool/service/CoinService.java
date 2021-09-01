package com.accolite.coinexchange.coinschool.service;

import com.accolite.coinexchange.coinschool.model.Coin;
import com.accolite.coinexchange.coinschool.repository.CoinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoinService {

    @Autowired
    private CoinRepository coinRepository;


    public Coin listCoin(Coin coin){
        return coinRepository.save(coin);
    }

    public List<Coin> getListedCoins(){
        return coinRepository.getListedCoins();
    }

    public int delistCoin(long id){
        return coinRepository.delistCoin(id);
    }
}
