package com.example.cinemamanagement.event.model;

import com.example.cinemamanagement.cinemaHall.model.CinemaHall;
import com.example.cinemamanagement.film.model.Film;
import com.example.cinemamanagement.reservation.model.Reservation;
import com.example.cinemamanagement.reservedSeat.model.ReservedSeat;
import com.example.cinemamanagement.shared.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "event")
@Table(name = "event")
public class Event extends BaseEntity {

    @Column(name = "screening_date_time", nullable = false)
    @Future(message = "Screening date-time must be from the future.")
    private LocalDateTime screeningDateTime;

    /* RELATIONS */

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "cinema_hall_id", insertable = false, updatable = false)
    private CinemaHall cinemaHall;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "event_film",
            joinColumns = {@JoinColumn(name = "id_event", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_film", referencedColumnName = "id")},
            indexes = {@Index(name = "event_film_index", columnList = "id_event,id_film", unique = true)})
    @Fetch(value = FetchMode.SUBSELECT)
    private List<Film> films;

    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ReservedSeat> reservedSeats;

}
