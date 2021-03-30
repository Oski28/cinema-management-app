package com.example.cinemamanagement.role.model;

import com.example.cinemamanagement.shared.BaseEntity;
import com.example.cinemamanagement.user.model.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true, doNotUseGetters = true)
@ToString(callSuper = true, doNotUseGetters = true)
@Entity(name = "role")
@Table(name = "role")
public class Role extends BaseEntity {

    @Column(name = "role", unique = true, nullable = false, length = 25)
    @NotBlank(message = "Role cannot be blank.")
    @Size(min = 4, max = 25, message = "Role must contain between 4 and 25 characters.")
    private String role;

    @Lob
    @Column(name = "description", nullable = false, length = 350)
    @NotBlank(message = "Description cannot be blank.")
    @Size(min = 20, max = 350, message = "Description must contain between 20 and 350 characters.")
    private String description;

    /* RELATIONS */

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<User> users = new ArrayList<>();
}
