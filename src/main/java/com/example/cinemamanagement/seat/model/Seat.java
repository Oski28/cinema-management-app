package com.example.cinemamanagement.seat.model;

import com.example.cinemamanagement.cinemaHall.model.CinemaHall;
import com.example.cinemamanagement.shared.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "seat")
@Table(name = "seat")
public class Seat extends BaseEntity {

    @Column(name = "line", nullable = false)
    @NotNull(message = "Line cannot be null.")
    private Line line;

    @Column(name = "number", nullable = false)
    @NotNull(message = "Seat number cannot be null.")
    @Size(min = 1, max = 20, message = "Seat number must be between 1 and 20.")
    private Integer number;

    @Column(name = "type", nullable = false)
    @NotNull(message = "Seat type cannot be null.")
    private Type type;

    /* RELATIONS */

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.MERGE)
    @JoinColumn(name = "cinema_hall_id", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private CinemaHall cinemaHall;

}
