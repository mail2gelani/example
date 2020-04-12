package com.companyname.springbootcrudrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
@PropertySource("file:${config_path}")
public class SpringBootCrudRestApplication {
		

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudRestApplication.class, args);
		
	}
	
	
}
