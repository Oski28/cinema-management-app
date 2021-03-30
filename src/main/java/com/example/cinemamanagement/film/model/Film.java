package com.example.cinemamanagement.film.model;

import com.example.cinemamanagement.director.model.Director;
import com.example.cinemamanagement.event.model.Event;
import com.example.cinemamanagement.genre.model.Genre;
import com.example.cinemamanagement.producer.model.Producer;
import com.example.cinemamanagement.shared.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "film")
@Table(name = "film")
public class Film extends BaseEntity {

    @Column(name = "title", nullable = false, unique = true, length = 50)
    @NotBlank(message = "Title cannot be blank.")
    @Size(min = 2, max = 50, message = "Title must contain between 2 and 50 characters.")
    private String title;

    @Column(name = "duration", nullable = false)
    @NotBlank(message = "Duration cannot be blank")
    private Duration duration;

    @Column(name = "age_limit")
    @Size(min = 7, max = 18, message = "Age limit must be between 7 and 18.")
    private Integer ageLimit;

    /* RELATIONS */

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "producer_id", insertable = false, updatable = false)
    private Producer producer;

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "director_id", insertable = false, updatable = false)
    private Director director;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name = "film_genre",
            joinColumns = {@JoinColumn(name = "id_film", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_genre", referencedColumnName = "id")},
            indexes = {@Index(name = "film_genre_index", columnList = "id_film,id_genre", unique = true)})
    private Set<Genre> genres = new HashSet<>();

    @ManyToMany(mappedBy = "films", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Event> events = new ArrayList<>();
}
