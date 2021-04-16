package com.example.cinemamanagement.reservedSeat.converter;

import com.example.cinemamanagement.reservedSeat.dto.ReservedSeatDto;
import com.example.cinemamanagement.reservedSeat.model.ReservedSeat;
import com.example.cinemamanagement.shared.BaseConverter;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ReservedSeatConverter extends BaseConverter<ReservedSeat, ReservedSeatDto> {
    @Override
    public Function<ReservedSeatDto, ReservedSeat> toEntity() {
        return dto -> {
            if (dto == null)
                return null;

            ReservedSeat reservedSeat = new ReservedSeat();

            reservedSeat.setId(dto.getId());
            reservedSeat.setReservation(dto.getReservation()); // reservation converter
            reservedSeat.setEvent(dto.getReservation().getEvent()); // converter
            reservedSeat.setSeat(dto.getSeat()); //converter

            return reservedSeat;
        };
    }

    @Override
    public Function<ReservedSeat, ReservedSeatDto> toDto() {
        return reservedSeat -> {
            if (reservedSeat == null)
                return null;

            ReservedSeatDto dto = new ReservedSeatDto();

            dto.setId(reservedSeat.getId());
            dto.setReservation(reservedSeat.getReservation()); //conv
            dto.setSeat(reservedSeat.getSeat()); // conv

            return dto;
        };
    }
}
