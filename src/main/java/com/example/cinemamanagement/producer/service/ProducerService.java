package com.example.cinemamanagement.producer.service;

import com.example.cinemamanagement.producer.model.Producer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface ProducerService {

    Page<Producer> findAllContainsParameter(int page, int size, String column, Sort.Direction direction, String parameter);
}
