package com.camila.autospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AutoSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoSpringbootApplication.class, args);
	}

}
