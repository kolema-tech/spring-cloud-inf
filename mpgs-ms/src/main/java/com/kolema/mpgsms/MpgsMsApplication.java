package com.kolema.mpgsms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MpgsMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MpgsMsApplication.class, args);
	}
}
