package com.example.ConsumerMS.controller;

import com.example.ConsumerMS.consumer.IShoppingConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShoppingController {

    @Autowired
    private IShoppingConsumer consumer;

    @GetMapping("/info")
    public String sayHi() {
        return "From Shopping Consumer Service .." + consumer.fetchMsgFromProducerMS();
    }
}
