package com.example.cinemamanagement.director.converter;

import com.example.cinemamanagement.director.dto.DirectorDto;
import com.example.cinemamanagement.director.model.Director;
import com.example.cinemamanagement.shared.BaseConverter;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class DirectorConverter extends BaseConverter<Director, DirectorDto> {
    @Override
    public Function<DirectorDto, Director> toEntity() {
        return dto -> {
            if (dto == null)
                return null;
            Director director = new Director();

            director.setFirstName(dto.getFirstName());
            director.setLastName(dto.getLastName());
            director.setDateOfBirth(dto.getDateOfBirth());

            return director;
        };
    }

    @Override
    public Function<Director, DirectorDto> toDto() {
        return director -> {
            if (director == null)
                return null;

            DirectorDto dto = new DirectorDto();

            dto.setFirstName(director.getFirstName());
            dto.setLastName(director.getLastName());
            dto.setDateOfBirth(director.getDateOfBirth());

            return dto;
        };
    }
}
