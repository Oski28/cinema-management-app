package com.example.cinemamanagement.director.model;

import com.example.cinemamanagement.film.model.Film;
import com.example.cinemamanagement.shared.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "director")
@Table(name = "director")
public class Director extends BaseEntity {

    @Column(name = "firstname", nullable = false, length = 50)
    @NotBlank(message = "Firstname cannot be blank.")
    @Size(min = 3, max = 50, message = "Firstname must contain between 3 and 50 characters.")
    private String firstName;

    @Column(name = "lastname", nullable = false, length = 50)
    @NotBlank(message = "Lastname cannot be blank.")
    @Size(min = 3, max = 50, message = "Lastname must contain between 3 and 50 characters.")
    private String lastName;

    @Column(name = "date_of_birth", nullable = false)
    @NotNull(message = "Date of birth cannot be null.")
    private LocalDate dateOfBirth;

    /* RELATIONS */

    @OneToMany(mappedBy = "director", fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    List<Film> films;
}
