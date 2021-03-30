package com.example.cinemamanagement.genre.model;

import com.example.cinemamanagement.film.model.Film;
import com.example.cinemamanagement.shared.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "genre")
@Table(name = "genre")
public class Genre extends BaseEntity {

    @Column(name = "name", nullable = false, unique = true, length = 50)
    @NotBlank(message = "Genre name cannot be blank.")
    @Size(min = 5, max = 50, message = "Genre name must contain between 5 and 50 characters.")
    private String name;

    @ManyToMany(mappedBy = "genres", fetch = FetchType.LAZY)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Film> films;
}
