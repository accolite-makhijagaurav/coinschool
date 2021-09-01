package com.accolite.coinexchange.coinschool.repository;

import com.accolite.coinexchange.coinschool.model.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CoinRepository extends JpaRepository<Coin,Long> {

    @Query(value = "SELECT * FROM COINS WHERE DELETED=0 AND LISTED=1",nativeQuery = true)
     List<Coin> getListedCoins();

    @Transactional
    @Modifying()
    @Query(value = "UPDATE COINS SET LISTED=0 WHERE ID=12",nativeQuery = true)
    int delistCoin(@Param("id") long id);
}
