package com.example.cinemamanagement.director.repository;

import com.example.cinemamanagement.director.model.Director;
import com.example.cinemamanagement.shared.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface DirectorRepository extends BaseRepository<Director> {

    @Query(
            value = "SELECT d.* FROM director d " +
                    "WHERE (UPPER(d.firstName)) LIKE CONCAT('%',UPPER(:parameter),'%')" +
                    "OR (UPPER(d.lastName)) LIKE CONCAT('%',UPPER(:parameter),'%')",
            countQuery = "SELECT COUNT(*) FROM director d " +
                    "WHERE (UPPER(d.firstName)) LIKE CONCAT('%',UPPER(:parameter),'%')" +
                    "OR (UPPER(d.lastName)) LIKE CONCAT('%',UPPER(:parameter),'%')",
            nativeQuery = true
    )
    Page<Director> findAllByFirstNameOrLastNameContains(String parameter, Pageable pageable);
}
