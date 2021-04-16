package com.example.cinemamanagement.cinemaHall.converter;

import com.example.cinemamanagement.cinemaHall.dto.CinemaHallDto;
import com.example.cinemamanagement.cinemaHall.model.CinemaHall;
import com.example.cinemamanagement.shared.BaseConverter;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class CinemaHallConverter extends BaseConverter<CinemaHall, CinemaHallDto> {
    @Override
    public Function<CinemaHallDto, CinemaHall> toEntity() {
        return dto -> {
            if (dto == null)
                return null;

            CinemaHall cinemaHall = new CinemaHall();

            cinemaHall.setId(dto.getId());
            cinemaHall.setScreenType(dto.getScreenType());
            cinemaHall.setSeats(dto.getSeats()); // seat converter


            return cinemaHall;
        };
    }

    @Override
    public Function<CinemaHall, CinemaHallDto> toDto() {
        return cinemaHall -> {
            if (cinemaHall == null)
                return null;

            CinemaHallDto dto = new CinemaHallDto();

            dto.setId(cinemaHall.getId());
            dto.setScreenType(cinemaHall.getScreenType());
            dto.setSeats(cinemaHall.getSeats()); // seat converter

            return dto;
        };
    }
}
