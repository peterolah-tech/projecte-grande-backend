package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);

//    void addMeal(Meal meal);

}
