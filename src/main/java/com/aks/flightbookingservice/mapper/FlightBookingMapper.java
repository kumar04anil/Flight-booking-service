package com.aks.flightbookingservice.mapper;

import com.aks.flightbookingservice.entities.BookingEntity;
import com.aks.model.BookingDataDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper implementation for flight service to convert entity to dto and vice versa.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FlightBookingMapper {

    @Mapping(source = "source", target = "source")
    @Mapping(source = "destination", target = "destination")
    BookingEntity map(BookingDataDto bookingDataDto);
}
