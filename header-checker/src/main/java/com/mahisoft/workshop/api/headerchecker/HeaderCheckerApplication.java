package com.mahisoft.workshop.api.headerchecker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.mahisoft.workshop"})
public class HeaderCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeaderCheckerApplication.class, args);
	}
}
