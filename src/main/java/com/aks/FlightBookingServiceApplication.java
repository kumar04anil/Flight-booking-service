package com.aks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

/**
 * This class is the main class
 */
@SpringBootApplication(scanBasePackages = "com.aks")
@ComponentScan({"com.aks.flightbookingservice"})
@EntityScan(basePackages = {"com.aks.flightbookingservice.entities"})
public class FlightBookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightBookingServiceApplication.class, args);
	}

}
