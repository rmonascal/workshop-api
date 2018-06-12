package com.mahisoft.workshop.api.headerchecker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class HeaderCheckerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeaderCheckerApplication.class, args);
	}
}
