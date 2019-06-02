package com.buyer.demo.buyer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer, Integer>  {

    public Buyer findBuyerByBuyerRegno(String buyerRegno);
    public void deleteBuyerById(int id);
    public Buyer findBuyerById(int id);
}
