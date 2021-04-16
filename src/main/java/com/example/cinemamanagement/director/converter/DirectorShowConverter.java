package com.example.cinemamanagement.director.converter;

import com.example.cinemamanagement.director.dto.DirectorShowDto;
import com.example.cinemamanagement.director.model.Director;
import com.example.cinemamanagement.film.model.Film;
import com.example.cinemamanagement.shared.BaseConverter;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class DirectorShowConverter extends BaseConverter<Director, DirectorShowDto> {

    @Override
    public Function<DirectorShowDto, Director> toEntity() {
        return dto -> {
            if (dto == null)
                return null;

            Director director = new Director();

            director.setId(dto.getId());
            director.setFirstName(dto.getFirstName());
            director.setDateOfBirth(dto.getDateOfBirth());
            director.setLastName(dto.getLastName());

            return director;
        };
    }

    @Override
    public Function<Director, DirectorShowDto> toDto() {
        return director -> {
            if (director == null)
                return null;

            DirectorShowDto dto = new DirectorShowDto();

            dto.setId(director.getId());
            dto.setFirstName(director.getFirstName());
            dto.setLastName(director.getLastName());
            dto.setDateOfBirth(director.getDateOfBirth());
            dto.setFilmTitles(director.getFilms().stream().map(Film::getTitle).collect(Collectors.toList()));
            return dto;
        };
    }
}
