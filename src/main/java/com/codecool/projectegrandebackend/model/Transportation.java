package com.codecool.projectegrandebackend.model;

import com.codecool.projectegrandebackend.model.generated.transport.vehicle.FuelType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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

    private double distance;

    private double fuelEfficiency;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    private float vehicleCarbonInKg;


    private float flightCarbonInKg;

    private String airportFrom;
    private String airportThrough;
    private String airportTo;

}
