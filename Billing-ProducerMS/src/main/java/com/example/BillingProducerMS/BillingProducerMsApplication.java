package com.example.BillingProducerMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BillingProducerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingProducerMsApplication.class, args);
	}

}
