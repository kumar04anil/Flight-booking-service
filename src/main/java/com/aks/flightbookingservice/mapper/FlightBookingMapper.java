package com.aks.flightbookingservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * Mapper implementation for flight service to convert entity to dto and vice versa.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FlightBookingMapper {
}
