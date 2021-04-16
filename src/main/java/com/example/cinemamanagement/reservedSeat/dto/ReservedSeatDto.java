package com.example.cinemamanagement.reservedSeat.dto;

import com.example.cinemamanagement.reservation.model.Reservation;
import com.example.cinemamanagement.seat.model.Seat;
import lombok.Data;

@Data
public class ReservedSeatDto {

    private Long id;
    private Reservation reservation;
    private Seat seat;
}
