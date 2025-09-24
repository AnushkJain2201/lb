package com.legalbreeze;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LegalBreezeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegalBreezeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("Started Legal Breeze Application");
		};
	}
}
