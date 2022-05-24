package com.packaginganddelevery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PackagingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PackagingServiceApplication.class, args);
	}

}
