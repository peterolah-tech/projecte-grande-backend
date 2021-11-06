package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.FlightTransportation;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface FlightTransportationRepository extends JpaRepository<FlightTransportation,Long> {

    List<FlightTransportation> findAllByUser(AppUser user);
}
