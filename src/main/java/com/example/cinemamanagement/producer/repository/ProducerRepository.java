package com.example.cinemamanagement.producer.repository;

import com.example.cinemamanagement.producer.model.Producer;
import com.example.cinemamanagement.shared.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface ProducerRepository extends BaseRepository<Producer> {

    @Query(
            value = "SELECT p.* FROM producer p " +
                    "WHERE (UPPER(p.name)) LIKE CONCAT('%',UPPER(:parameter),'%')",
            countQuery = "SELECT COUNT(*) FROM producer p " +
                    "WHERE (UPPER(d.name)) LIKE CONCAT('%',UPPER(:parameter),'%')",
            nativeQuery = true
    )
    Page<Producer> findAllByNameContains(String parameter, Pageable pageable);
}
