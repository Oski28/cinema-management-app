package com.example.cinemamanagement.director.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class DirectorDto {

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
}