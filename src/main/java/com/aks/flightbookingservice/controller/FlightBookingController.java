package com.aks.flightbookingservice.controller;

import com.aks.api.BookingApi;
import com.aks.flightbookingservice.service.FlightBookingService;
import com.aks.model.BookingDataDto;
import com.aks.model.BookingFullResponseDataDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class for performing Flight Booking CRUD operation.
*/
@RestController
@RequiredArgsConstructor
@Slf4j
public class FlightBookingController implements BookingApi {

    @Autowired
    FlightBookingService bookingService;

    @Override
    public ResponseEntity<BookingFullResponseDataDto> flightBooking(BookingDataDto bookingDataDto) {
        log.info("inside controller ::flightBooking:: bookingDataDto ::" + bookingDataDto);
        return new ResponseEntity<>(bookingService.flightBooking(bookingDataDto), HttpStatus.OK);
    }
}
