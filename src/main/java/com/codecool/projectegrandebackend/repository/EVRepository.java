package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.AppUser;
import com.codecool.projectegrandebackend.model.EV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;


public interface EVRepository extends JpaRepository<EV, Long> {

    EV findEVByEvId(Integer evId);

    boolean existsByEvId(@Param("evId") Integer evId);

    @Query(value = "select count(*) from users_evs where ev_id = ?1", nativeQuery = true)
    int findEVCountByDistinctEVId(Long evId);

    @Query(value = "SELECT CASE WHEN count(*) > 0 THEN true ELSE false END  from users_evs where user_id = ?1 and ev_id = ?2", nativeQuery = true)
    boolean existsByUserIdAAndEvId(Long userId, Long evId);

    List<EV> findEVSByAppUsers(AppUser user);

}
