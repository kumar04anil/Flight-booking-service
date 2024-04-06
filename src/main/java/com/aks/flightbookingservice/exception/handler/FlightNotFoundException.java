package com.aks.flightbookingservice.exception.handler;

/**
 * Custom exception for FlightNotFound.
 */
public class FlightNotFoundException extends RuntimeException {
    public FlightNotFoundException(String message) {
        super(message);
    }
}
