package com.codecool.projectegrandebackend.model;

import lombok.*;
import lombok.experimental.SuperBuilder;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class FlightTransportation extends Transportation{

    @Id
    @GeneratedValue
    private Long id;

    private String airportFrom;
    private String airportThrough;
    private String airportTo;

//    @Builder
//    public FlightTransportation(LocalDate dateOfTravel, String airportFrom, String airportThrough, String airportTo, float equivalentCarbonInKg) {
//        super(dateOfTravel, equivalentCarbonInKg);
//        this.airportFrom = airportFrom;
//        this.airportThrough = airportThrough;
//        this.airportTo = airportTo;
//    }
//
//    @Builder
//    public FlightTransportation(Long id, LocalDate dateOfTravel, String airportFrom, String airportThrough, String airportTo, float equivalentCarbonInKg) {
//        super(dateOfTravel, equivalentCarbonInKg);
//        this.id = id;
//        this.airportFrom = airportFrom;
//        this.airportThrough = airportThrough;
//        this.airportTo = airportTo;
//    }
//

}
