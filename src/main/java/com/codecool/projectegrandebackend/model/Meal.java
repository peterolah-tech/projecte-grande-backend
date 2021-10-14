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

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinTable(
            name = "user_meal",
            joinColumns = @JoinColumn(name = "meal_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    // @Singular
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<User> consumingUsers;

    //tostring exclude, plus hashcode
    // and need jsonignore annotation too

}
