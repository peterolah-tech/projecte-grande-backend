package com.codecool.projectegrandebackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
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

    private Date consumptionDate;

    private int apiId;

    // https://vegsoc.org/info-hub/why-go-veggie/environment/
    @Transient
    private static final double meatEmissionValue = 21.0;

    @Transient
    private static final double vegaEmissionValue = 8.4;

    @Singular
    @ManyToMany(mappedBy = "consumedMeals", cascade = {
            CascadeType.ALL}, fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @JsonIgnore
    private Set<AppUser> users = new HashSet<>();
    // TODO: ask Ani about initiation here
}
