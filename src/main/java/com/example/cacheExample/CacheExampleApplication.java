package com.example.cacheExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.Locale;

@SpringBootApplication
@EnableCaching
public class CacheExampleApplication {

	private static final Logger log = LogManager.getLogger(CacheExampleApplication.class);

	public static void main(String[] args) {
		System.out.println("Testing.....");
		log.info("welcome to main project...");
		SpringApplication.run(CacheExampleApplication.class, args);
	}

}
