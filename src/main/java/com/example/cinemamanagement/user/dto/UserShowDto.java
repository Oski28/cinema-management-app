package com.example.cinemamanagement.user.dto;

import lombok.Data;

@Data
public class UserShowDto {

    private Long id;
    private String email;
    private String telephoneNumber;
    private String dateOfBirth;
    private String clientCardId;
    private String firstName;
    private String lastName;
}
