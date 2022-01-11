package com.example.ConsumerMS.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Billing-Service")
public interface IShoppingConsumer {

    @GetMapping("/billing/info")
    public String fetchMsgFromProducerMS();
}
