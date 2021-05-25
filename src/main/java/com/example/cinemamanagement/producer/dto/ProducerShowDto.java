package com.example.cinemamanagement.producer.dto;

import lombok.Data;

import java.util.List;

@Data
public class ProducerShowDto {

    private Long id;
    private String name;
    private List<String> filmTitles;
}
