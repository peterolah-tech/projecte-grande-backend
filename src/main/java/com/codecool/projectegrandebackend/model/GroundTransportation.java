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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double distance;

    private double fuelEfficiency;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

}

