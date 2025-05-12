package com.example.cacheExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheExampleApplication {

	public static void main(String[] args) {
		System.out.println("Testing.....");
		SpringApplication.run(CacheExampleApplication.class, args);
	}

}
