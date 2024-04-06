package com.aks.flightbookingservice.repository;

import com.aks.flightbookingservice.entities.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This is repo for FlightData entity.
 */
@Repository
public interface FlightBookingRepository extends JpaRepository<BookingEntity, Long> {
}
