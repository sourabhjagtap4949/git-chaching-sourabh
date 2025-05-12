package com.example.cacheExample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(value = MockitoExtension.class)
class CacheExampleApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Handling exception...  ");
	}



}
