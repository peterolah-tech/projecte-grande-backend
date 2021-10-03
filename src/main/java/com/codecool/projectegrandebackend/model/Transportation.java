package com.codecool.projectegrandebackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Transportation {

    @Id
    @GeneratedValue
    private long id;

    private LocalDate dateOfTravel;

    private float vehicleCarbonInKg;

    private float flightCarbonInKg;

}
