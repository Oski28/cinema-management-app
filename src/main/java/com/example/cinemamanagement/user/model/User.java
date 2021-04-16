package com.example.cinemamanagement.user.model;

import com.example.cinemamanagement.reservation.model.Reservation;
import com.example.cinemamanagement.role.model.Role;
import com.example.cinemamanagement.shared.BaseEntity;
import com.example.cinemamanagement.user.constraint.ValidPassword;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(doNotUseGetters = true)
@NoArgsConstructor
@Entity(name = "user")
@Table(name = "user")
public class User extends BaseEntity {

    @Column(name = "email", unique = true, nullable = false, length = 50)
    @Email(message = "Email must be correct.")
    private String email;

    @Column(name = "password", nullable = false, length = 100)
    @ValidPassword
    private String password;

    @Column(name = "telephone_number", length = 15)
    @Pattern(regexp = "^(?=.{9,15}$)\\+?(((\\d{2,3}[ ]?)*)|((\\d{2,3}[-]?)*))$",
            message = "Telephone number may start with '+', must contain from 9 to 15 characters(only digits) without spaces " +
                    "or in 2-3 characters blocks separated by space or '-'.")
    private String telephoneNumber;

    @Column(name = "date_of_birth", nullable = false)
    @NotNull(message = "Date of birth cannot be null.")
    private LocalDate dateOfBirth;

    @Column(name = "client_card_id", nullable = false, length = 9)
    @Pattern(regexp = "^(?=.{9}$)[SPV]\\d*$",
            message = "Client card id must start with S,P or V and contain 8 digits without spaces.")
    private String clientCardId;

    @Column(name = "firstname", nullable = false, length = 50)
    @NotBlank(message = "Firstname cannot be blank.")
    @Size(min = 3, max = 50, message = "Firstname must contain between 3 and 50 characters.")
    private String firstName;

    @Column(name = "lastname", nullable = false, length = 50)
    @NotBlank(message = "Lastname cannot be blank.")
    @Size(min = 3, max = 50, message = "Lastname must contain between 3 and 50 characters.")
    private String lastName;

    @Column(name = "expiration_date", nullable = false)
    @Future(message = "Expiration date must be from the future.")
    private LocalDate expirationDate;

    /* RELATIONS */

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
            joinColumns = {@JoinColumn(name = "id_user", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "id_role", referencedColumnName = "id")},
            indexes = {@Index(name = "user_role_index", columnList = "id_user,id_role", unique = true)})
    private Set<Role> roles;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.REMOVE})
    private List<Reservation> reservations;

}
