package com.mini.Lulu02_Registery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class Lulu02RegisteryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lulu02RegisteryApplication.class, args);
	}

}
