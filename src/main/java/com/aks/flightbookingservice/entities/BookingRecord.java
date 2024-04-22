package com.aks.flightbookingservice.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookingRecord {

    private long bookingId;
    private LocalDate bookingDate;
    private String destination;
    private String source;
    private double fare;
    private String flightDate;
    private String flightNumber;
    private LocalTime flightTime;
    private String status;
}
