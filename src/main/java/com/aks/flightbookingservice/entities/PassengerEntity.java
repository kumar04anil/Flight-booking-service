package com.aks.flightbookingservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PASSENGER")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class PassengerEntity {
    @Id
    @GeneratedValue
    private long passengerId;
    private String emailAddress;
    private String firstName;
    private String gender;
    private String lastName;
    private long mobileNumber;
    private long bookingId;
}
