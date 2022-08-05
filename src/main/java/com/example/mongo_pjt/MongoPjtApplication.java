package com.example.mongo_pjt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.mongo_pjt.repository.ChatRepository")
@SpringBootApplication
public class MongoPjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoPjtApplication.class, args);
	}

}
