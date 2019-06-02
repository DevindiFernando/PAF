package com.buyer.demo.buyer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuyerController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping(value = "/demo/buyers", params = "buyer_regno")
    public ResponseEntity<Buyer> getBuyerByBuyerRegno(@RequestParam(name = "buyer_regno") String buyerRegno) {
        return new ResponseEntity<Buyer>(buyerService.getBuyerByBuyerRegno(buyerRegno), HttpStatus.OK);
    }

    @GetMapping("/demo/buyers")
    public ResponseEntity<List<Buyer>> getAllBuyers(){
        return new ResponseEntity<>(buyerService.getAllBuyers(), HttpStatus.OK);
    }

    @PostMapping("/demo/buyers")
    public ResponseEntity<Buyer> createBuyer(@RequestBody Buyer buyer){
        return new ResponseEntity<>(buyerService.createBuyer(buyer),HttpStatus.OK);
    }

    @PutMapping("/demo/buyers/{id}")
    public ResponseEntity<Buyer> updateBuyer(@PathVariable int buyer_id, @RequestBody Buyer buyer){
        return new ResponseEntity<Buyer>(buyerService.updateBuyer(buyer_id, buyer), HttpStatus.OK);
    }

   @DeleteMapping("demo/buyers/{id}")
        public ResponseEntity deleteBuyer(@PathVariable int buyer_id) {
            buyerService.deleteBuyer(buyer_id);
            return new ResponseEntity(HttpStatus.OK);

        }
}
