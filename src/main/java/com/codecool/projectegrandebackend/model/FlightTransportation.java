package com.codecool.projectegrandebackend.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FlightTransportation extends Transportation{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String airportFrom;
    private String airportThrough;
    private String airportTo;

}
