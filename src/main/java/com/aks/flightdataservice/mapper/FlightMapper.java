package com.aks.flightdataservice.mapper;

import com.aks.flightdataservice.entities.FlightEntity;
import com.aks.model.FlightDataDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.util.List;

/**
 * Mapper implementation for flight service to convert entity to dto and vice versa.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface FlightMapper {
    FlightEntity map(FlightDataDto flightDataDto);
    FlightDataDto map (FlightEntity flightEntity);
    List<FlightDataDto> flightEntityToDtoList(List<FlightEntity> flightEntityList);
}
