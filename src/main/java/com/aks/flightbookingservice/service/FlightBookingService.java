package com.aks.flightbookingservice.service;

import com.aks.model.BookingDataDto;
import com.aks.model.BookingFullResponseDataDto;

/**
 * Flight Booking data service.
 */
public interface FlightBookingService {
    BookingFullResponseDataDto flightBooking(BookingDataDto bookingDataDto);
}
