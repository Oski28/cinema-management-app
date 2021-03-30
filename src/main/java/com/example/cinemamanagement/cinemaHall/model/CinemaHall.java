package com.example.cinemamanagement.cinemaHall.model;

import com.example.cinemamanagement.event.model.Event;
import com.example.cinemamanagement.seat.model.Seat;
import com.example.cinemamanagement.shared.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "cinema_hall")
@Table(name = "cinema_hall")
public class CinemaHall extends BaseEntity {

    @Column(name = "screen_type", nullable = false)
    @NotNull(message = "Screen type cannot be null.")
    private ScreenType screenType;

    /* RELATIONS */

    @OneToMany(mappedBy = "cinemaHall", fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Event> event;

    @OneToMany(mappedBy = "cinemaHall", fetch = FetchType.LAZY)
    private List<Seat> seats;
}
