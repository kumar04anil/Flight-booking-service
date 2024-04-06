package com.aks.flightbookingservice.service.serviceImpl;

import com.aks.flightbookingservice.service.FlightBookingService;
import com.aks.model.BookingDataDto;
import com.aks.model.BookingFullResponseDataDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * FlightBooking Data service.
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class FlightBookingServiceImpl implements FlightBookingService {
    @Override
    public BookingFullResponseDataDto flightBooking(BookingDataDto bookingDataDto) {
        log.info("inside service ::flightBooking:: bookingDataDto ::" + bookingDataDto);
        return null;
    }
}
