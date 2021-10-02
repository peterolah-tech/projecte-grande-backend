package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
