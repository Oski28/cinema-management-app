package com.example.cinemamanagement.producer.model;

import com.example.cinemamanagement.film.model.Film;
import com.example.cinemamanagement.shared.BaseEntity;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "producer")
@Table(name = "producer")
public class Producer extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true, length = 50)
    @NotBlank(message = "Producer name cannot be blank.")
    @Size(min = 5, max = 50, message = "Producer name must contain between 5 and 50 characters.")
    private String name;

    /* RELATIONS */

    @OneToMany(mappedBy = "producer", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    List<Film> films;
}
