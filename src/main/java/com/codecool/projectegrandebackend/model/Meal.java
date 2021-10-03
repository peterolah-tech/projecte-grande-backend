package com.codecool.projectegrandebackend.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Meal {

    @Id
    @GeneratedValue
    private Long id;

    private int apiId;

    @Transient
    private double emissionValue;

    @ManyToMany
    @JoinTable(
            name = "user_meal",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "meal_id"))
    @Singular
    private Set<User> users;

    //tostring exclude, plus hashcode
    // and need jsonignore annotation too

}
