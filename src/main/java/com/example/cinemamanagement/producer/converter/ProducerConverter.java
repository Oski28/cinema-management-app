package com.example.cinemamanagement.producer.converter;

import com.example.cinemamanagement.producer.dto.ProducerDto;
import com.example.cinemamanagement.producer.model.Producer;
import com.example.cinemamanagement.shared.BaseConverter;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class ProducerConverter extends BaseConverter<Producer, ProducerDto> {
    @Override
    public Function<ProducerDto, Producer> toEntity() {
        return dto -> {
            if (dto == null)
                return null;

            Producer producer = new Producer();

            producer.setName(dto.getName());

            return producer;
        };
    }

    @Override
    public Function<Producer, ProducerDto> toDto() {
        return producer -> {
            if (producer == null)
                return null;

            ProducerDto dto = new ProducerDto();

            dto.setName(producer.getName());

            return dto;
        };
    }
}
