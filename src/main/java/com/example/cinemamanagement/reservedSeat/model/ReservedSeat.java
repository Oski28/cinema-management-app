package com.example.cinemamanagement.reservedSeat.model;

import com.example.cinemamanagement.event.model.Event;
import com.example.cinemamanagement.reservation.model.Reservation;
import com.example.cinemamanagement.seat.model.Seat;
import com.example.cinemamanagement.shared.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "reservation_seat")
@Table(name = "reservation_seat")
public class ReservedSeat extends BaseEntity {

    /* RELATIONS */

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.MERGE)
    @JoinColumn(name = "reservation_id", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Reservation reservation;

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = CascadeType.MERGE)
    @JoinColumn(name = "event_id", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Event event;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "seat_id", insertable = false, updatable = false)
    private Seat seat;
}
