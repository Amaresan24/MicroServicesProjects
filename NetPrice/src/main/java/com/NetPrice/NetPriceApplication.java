package com.NetPrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NetPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetPriceApplication.class, args);
	}
	   @Bean
	    RestTemplate rest() {
			return new RestTemplate();
		}
}
