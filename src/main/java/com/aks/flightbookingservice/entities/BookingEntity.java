package com.aks.flightbookingservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "BOOKING_RECORD")
public class BookingEntity implements Serializable {
    @Id
    @GeneratedValue
    private long bookingId;
    private CountryCode source;
    private CountryCode destination;
    private int seatReserved;
    private String flightNumber;
    private OffsetDateTime flightTime;
    private String status;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "bookingDetails", joinColumns = {@JoinColumn(name="bookingId")}, inverseJoinColumns = {@JoinColumn(name="passengerId")})
    private List<PassengerEntity> passengerDetails;
}