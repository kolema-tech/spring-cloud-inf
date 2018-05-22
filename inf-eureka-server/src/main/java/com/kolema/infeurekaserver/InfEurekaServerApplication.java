package com.kolema.infeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class InfEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfEurekaServerApplication.class, args);
	}
}
