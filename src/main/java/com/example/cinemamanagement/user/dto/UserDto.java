package com.example.cinemamanagement.user.dto;

import com.example.cinemamanagement.reservation.model.Reservation;
import com.example.cinemamanagement.role.model.Role;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
public class UserDto {

    private Long id;
    private String email;

    private String telephoneNumber;
    private String dateOfBirth;
    private String clientCardId;
    private String firstName;
    private String lastName;
    private LocalDate expirationDate;

    private Set<Role> roles;
    private List<Reservation> reservations;
}
