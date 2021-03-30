package com.example.cinemamanagement.reservation.model;

import com.example.cinemamanagement.event.model.Event;
import com.example.cinemamanagement.reservedSeat.model.ReservedSeat;
import com.example.cinemamanagement.shared.BaseEntity;
import com.example.cinemamanagement.user.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "reservation")
@Table(name = "reservation")
public class Reservation extends BaseEntity {

    @Column(name = "expiration_date_time", nullable = false)
    @Future(message = "Expiration date time must be from the future.")
    private LocalDateTime expirationDateTime;

    /* RELATIONS */

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private User user;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "event_id", insertable = false, updatable = false)
    private Event event;

    @OneToMany(mappedBy = "reservation", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ReservedSeat> reservedSeat;
}
