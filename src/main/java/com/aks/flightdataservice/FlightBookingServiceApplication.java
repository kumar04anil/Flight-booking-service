package com.aks.flightdataservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * This class is the main class
 */
@SpringBootApplication(scanBasePackages = "com.aks")
@ComponentScan({"com.aks.flightdataservice"})
@EntityScan(basePackages = {"com.aks"})
public class FlightBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingServiceApplication.class, args);
	}

}
