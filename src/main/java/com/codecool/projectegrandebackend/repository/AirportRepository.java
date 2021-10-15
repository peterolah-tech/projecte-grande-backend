package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}
