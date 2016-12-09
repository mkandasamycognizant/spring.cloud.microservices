package com.kandasm.opm.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

@EnableEurekaServer
@SpringBootApplication
public class STARTER {

	public static void main(String[] args) {
		SpringApplication.run(STARTER.class, args);
	}
	
	
	@Bean
	public CommandLineRunner runner(){
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				
			}
		};
	}
}