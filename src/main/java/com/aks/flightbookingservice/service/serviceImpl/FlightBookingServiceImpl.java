package com.aks.flightbookingservice.service.serviceImpl;

import com.aks.flightbookingservice.entities.BookingEntity;
import com.aks.flightbookingservice.mapper.FlightBookingMapper;
import com.aks.flightbookingservice.service.FlightBookingService;
import com.aks.model.BookingDataDto;
import com.aks.model.BookingFullResponseDataDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FlightBooking Data service.
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class FlightBookingServiceImpl implements FlightBookingService {

    @Autowired
    private final FlightBookingMapper bookingMapper;
    @Override
    public BookingFullResponseDataDto flightBooking(BookingDataDto bookingDataDto) {
        log.info("Inside service ::flightBooking:: bookingDataDto ::" + bookingDataDto);

        BookingEntity bookingEntity = bookingMapper.map(bookingDataDto);


        log.info("Exit service ::flightBooking:: bookingDataDto ::" + bookingDataDto);
        return null;
    }
}
