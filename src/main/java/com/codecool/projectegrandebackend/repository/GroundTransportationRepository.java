package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.FlightTransportation;
import com.codecool.projectegrandebackend.model.GroundTransportation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroundTransportationRepository extends JpaRepository<GroundTransportation,Long> {
}
