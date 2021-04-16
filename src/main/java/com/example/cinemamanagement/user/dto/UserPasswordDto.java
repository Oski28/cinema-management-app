package com.example.cinemamanagement.user.dto;

import com.example.cinemamanagement.user.constraint.ValidPassword;
import lombok.Data;

@Data
public class UserPasswordDto {

    @ValidPassword
    private String password;
}
