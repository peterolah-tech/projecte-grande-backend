package com.codecool.projectegrandebackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
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

    @Singular
    @ManyToMany(mappedBy = "consumedMeals", cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private Set<AppUser> users = new HashSet<>();
    // TODO: ask Ani about initiation here
}
