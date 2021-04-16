package com.example.cinemamanagement.director.service;

import com.example.cinemamanagement.director.model.Director;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface DirectorService {

    Page<Director> findAllContainsParameter(int page, int size, String column, Sort.Direction direction, String parameter);
}
