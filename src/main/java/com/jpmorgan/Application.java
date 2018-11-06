package com.jpmorgan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
//@ComponentScan(basePackages = "com.jpmorgan")
//@EntityScan
@EnableJpaRepositories
public class Application {

	
	

	public static void main(String[] args) {
		
		SpringApplication.run(Application.class, args);

	}

}
