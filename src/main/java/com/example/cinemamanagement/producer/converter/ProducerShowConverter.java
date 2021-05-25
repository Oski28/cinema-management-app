package com.example.cinemamanagement.producer.converter;

import com.example.cinemamanagement.film.model.Film;
import com.example.cinemamanagement.producer.dto.ProducerShowDto;
import com.example.cinemamanagement.producer.model.Producer;
import com.example.cinemamanagement.shared.BaseConverter;
import org.springframework.stereotype.Service;

import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ProducerShowConverter extends BaseConverter<Producer, ProducerShowDto> {
    @Override
    public Function<ProducerShowDto, Producer> toEntity() {
        return dto -> {
            if (dto == null)
                return null;

            Producer producer = new Producer();

            producer.setId(dto.getId());
            producer.setName(dto.getName());

            return producer;
        };
    }

    @Override
    public Function<Producer, ProducerShowDto> toDto() {
        return producer -> {
            if (producer == null)
                return null;

            ProducerShowDto dto = new ProducerShowDto();

            dto.setId(producer.getId());
            dto.setName(producer.getName());
            dto.setFilmTitles(producer.getFilms().stream().map(Film::getTitle).collect(Collectors.toList()));

            return dto;
        };
    }
}
