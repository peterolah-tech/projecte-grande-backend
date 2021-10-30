package com.codecool.projectegrandebackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import javax.persistence.*;
import java.time.LocalDate;


@AllArgsConstructor
@Getter
@NoArgsConstructor
@SuperBuilder
//@MappedSuperclass
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Transportation {

    @Id
    @GeneratedValue
    private Long id;

    protected LocalDate dateOfTravel;

    protected float equivalentCarbonInKg;


}
