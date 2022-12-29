package com.reliance.jio.telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JioTelecomProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JioTelecomProjectApplication.class, args);
	}

}
