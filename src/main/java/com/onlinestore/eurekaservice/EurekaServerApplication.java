package com.onlinestore.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Class that bootstraps this service.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {
	/**
	 * Main method, used to run this application.
	 *
	 * @param args the string array, that contains command line arguments.
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}