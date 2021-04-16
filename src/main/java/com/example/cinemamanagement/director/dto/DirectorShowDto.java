package com.example.cinemamanagement.director.dto;

import lombok.Data;


import java.time.LocalDate;
import java.util.List;


@Data
public class DirectorShowDto {

    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private List<String> filmTitles;
}
