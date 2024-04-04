package com.aks.flightdataservice.service.serviceImpl;

import com.aks.flightdataservice.entities.FlightEntity;
import com.aks.flightdataservice.exception.handler.DuplicateFlightException;
import com.aks.flightdataservice.exception.handler.FlightNotFoundException;
import com.aks.flightdataservice.mapper.FlightMapper;
import com.aks.flightdataservice.repository.FlightRepository;
import com.aks.flightdataservice.service.FlightService;
import com.aks.model.FlightDataDto;
import com.aks.model.FlightFullResponseDataDto;
import com.aks.model.FlightListDataDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;

/**
 * Flight data service.
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class FlightServiceImpl implements FlightService {

    @Autowired
    private final FlightMapper flightMapper;
    private final FlightRepository flightRepository;

    @Override
    public FlightListDataDto getFlightByFlightNumber(String flightNumber) {
        log.info("Inside service ::getFlightByFlightNumber:: flightNumber::" + flightNumber);
            List<FlightEntity> flightEntityList = flightRepository.findByFlightNumber(flightNumber);
            if(CollectionUtils.isEmpty(flightEntityList)) {
                log.error("No flight mapping found for provided flight number:" + flightNumber);
                throw new FlightNotFoundException("No flight exist with supplied flightNumber " + flightNumber);
        }
        FlightListDataDto flightListDataDto = new FlightListDataDto();
        flightListDataDto.setFlightList(flightMapper.flightEntityToDtoList(flightEntityList));
        log.info("service call end::getFlightByFlightNumber:: response::" + flightListDataDto);

        return flightListDataDto;
    }
    @Override
    public FlightFullResponseDataDto addNewAirLine(FlightDataDto flightDataDto) {
        log.info("Inside service ::addNewAirLine:: flightDataDto::" + flightDataDto);
        FlightEntity flightEntity = flightMapper.map(flightDataDto);
        List<FlightEntity> olderFlightDetails =
                flightRepository.findByFlightNumber(flightDataDto.getFlightNumber());

        FlightFullResponseDataDto responseDataDto = new FlightFullResponseDataDto();
        if(CollectionUtils.isEmpty(olderFlightDetails)) {

            var flightResponse = flightMapper.map(flightRepository.save(flightEntity));
            responseDataDto.setFlight(flightResponse);
            log.info("Service call end" + responseDataDto);
            return responseDataDto;
        }
        //responseDataDto.setFlight(flightMapper.map(olderFlightDetails.get(0)));
        //TODO for idempotency implementation.
        log.error("Duplicate flight details, Flight details already exists :: " + olderFlightDetails);
        throw new DuplicateFlightException("Flight details already exists " + flightDataDto.getFlightNumber());
    }

}
