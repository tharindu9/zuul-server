package com.tharindu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuulExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulExampleApplication.class, args);
	}
}
