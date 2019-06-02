package com.buyer.demo.buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BuyerService {

    @Autowired
    private BuyerRepository buyerRepository;

    public List<Buyer> getAllBuyers() {
        return buyerRepository.findAll();
    }

    public Buyer getBuyerByBuyerRegno(String buyerRegno) {
        return buyerRepository.findBuyerByBuyerRegno(buyerRegno);
    }

    public Buyer createBuyer(Buyer buyer) {return buyerRepository.save(buyer);}

    public Buyer updateBuyer(int id, Buyer buyerDetails){
        Buyer buyer = buyerRepository.findBuyerById(id);
        buyer.setBuyerRegno(buyerDetails.getBuyerRegno());
        buyer.setBuyerFirstname(buyerDetails.getBuyerFirstname());
        buyer.setBuyerLastname(buyerDetails.getBuyerLastname());
        buyer.setBuyerPassword(buyerDetails.getBuyerPassword());
        buyer.setBuyerStreetAddress(buyerDetails.getBuyerStreetAddress());
        buyer.setBuyerCity(buyerDetails.getBuyerCity());
        buyer.setBuyerZipcode(buyerDetails.getBuyerZipcode());
        buyer.setBuyerCountry(buyerDetails.getBuyerCountry());


        return buyerRepository.save(buyer);
    }
    public void deleteBuyer(int id){buyerRepository.deleteBuyerById(id);}

}
