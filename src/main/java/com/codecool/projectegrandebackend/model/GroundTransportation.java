package com.codecool.projectegrandebackend.model;

import com.codecool.projectegrandebackend.model.generated.transport.vehicle.FuelType;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class GroundTransportation extends Transportation{

    @Id
    @GeneratedValue
    private Long id;

    private double distance;

    private double fuelEfficiency;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

//    @Builder
//    public GroundTransportation(LocalDate dateOfTravel, float equivalentCarbonInKg, long id, double distance, double fuelEfficiency, FuelType fuelType) {
//        super(dateOfTravel, equivalentCarbonInKg);
//        this.id = id;
//        this.distance = distance;
//        this.fuelEfficiency = fuelEfficiency;
//        this.fuelType = fuelType;
//    }
//
//    @Builder
//    public GroundTransportation(Long id, LocalDate dateOfTravel, float equivalentCarbonInKg, double distance, double fuelEfficiency, FuelType fuelType) {
//        super(dateOfTravel, equivalentCarbonInKg);
//        this.distance = distance;
//        this.fuelEfficiency = fuelEfficiency;
//        this.fuelType = fuelType;
//    }
}

