package com.codecool.projectegrandebackend.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;


@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FlightTransportation extends Transportation{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transport_generator")
    @SequenceGenerator(name="transport_generator", sequenceName = "transport_seq")
    private Long id;

    private String airportFrom;
    private String airportThrough;
    private String airportTo;

}
