package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
}
