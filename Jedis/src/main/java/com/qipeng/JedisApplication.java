package com.qipeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.qipeng"})
public class JedisApplication {
	public static void main(String[] args) {
		SpringApplication.run(JedisApplication.class, args);
	}
}
