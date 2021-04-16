package com.example.cinemamanagement.cinemaHall.dto;

import com.example.cinemamanagement.cinemaHall.model.ScreenType;
import com.example.cinemamanagement.seat.model.Seat;
import lombok.Data;

import java.util.List;

@Data
public class CinemaHallDto {

    private Long id;
    private ScreenType screenType;
    private List<Seat> seats;
}
