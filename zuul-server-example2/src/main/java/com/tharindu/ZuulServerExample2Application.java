package com.tharindu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ZuulServerExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerExample2Application.class, args);
	}

}
