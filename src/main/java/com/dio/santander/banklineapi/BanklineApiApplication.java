package com.dio.santander.banklineapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan (basePackages = "dio.santander.banklineapi.model")

@SpringBootApplication
public class BanklineApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanklineApiApplication.class, args);
		//vamos iniciar
	}
	
	

}
