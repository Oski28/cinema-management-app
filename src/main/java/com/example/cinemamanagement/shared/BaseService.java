package com.example.cinemamanagement.shared;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

public interface BaseService<E extends BaseEntity> {

    Page<E> getAll(int page, int size, String column, Sort.Direction direction);

    boolean update(Long id, E entity);

    boolean delete(Long id);

    E save(E entity);

    E getById(Long id);

    boolean isExists(Long id);
}
