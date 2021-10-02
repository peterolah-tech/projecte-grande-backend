package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.EV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EVRepository extends JpaRepository<EV, Long> {
}
