package com.aks.flightdataservice.exception.handler;

/**
 * Custom exception for FlightNotFound.
 */
public class FlightNotFoundException extends RuntimeException {
    public FlightNotFoundException(String message) {
        super(message);
    }
}
