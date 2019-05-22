package com.sliit.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {

    @RequestMapping(value = "/payment")
    public String payment(){
        return "payment";
    }

}
