package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.GroundTransportation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroundTransportationRepository extends JpaRepository<GroundTransportation,Long> {

//    @Query("SELECT '*' FROM ground_transportation WHERE date_of_travel= current_date")
//    GroundTransportation findByDate(LocalDate dateOfNow);
}
