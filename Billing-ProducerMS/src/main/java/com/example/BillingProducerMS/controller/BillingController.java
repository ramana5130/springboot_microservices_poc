package com.example.BillingProducerMS.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing")
public class BillingController {

    @Value("${server.port}")
    private int port;

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/info")
    public String getMessage() {
        return "message from Billing Producer MS -- port::" + port + "---instanceId::" + instanceId;
    }
}
