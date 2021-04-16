package com.example.cinemamanagement.user.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class UserUpdateDto {

    @Email(message = "Email must be correct.")
    private String email;

    @Pattern(regexp = "^(?=.{9,15}$)\\+?(((\\d{2,3}[ ]?)*)|((\\d{2,3}[-]?)*))$",
            message = "Telephone number may start with '+', must contain from 9 to 15 characters(only digits) without spaces " +
                    "or in 2-3 characters blocks separated by space or '-'.")
    private String telephoneNumber;

    @NotNull(message = "Date of birth cannot be null.")
    private LocalDate dateOfBirth;

    @Pattern(regexp = "^(?=.{9}$)[SPV]\\d*$",
            message = "Client card id must start with S,P or V and contain 8 digits without spaces.")
    private String clientCardId;

    @NotBlank(message = "Firstname cannot be blank.")
    @Size(min = 3, max = 50, message = "Firstname must contain between 3 and 50 characters.")
    private String firstName;

    @NotBlank(message = "Lastname cannot be blank.")
    @Size(min = 3, max = 50, message = "Lastname must contain between 3 and 50 characters.")
    private String lastName;

    @Future(message = "Expiration date must be from the future.")
    private LocalDate expirationDate;
}
