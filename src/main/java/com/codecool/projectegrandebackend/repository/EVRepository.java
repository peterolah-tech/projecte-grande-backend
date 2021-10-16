package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.EV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.HashMap;

public interface EVRepository extends JpaRepository<EV, Long> {

    EV findEVByEvId(Integer evId);

    boolean existsByEvId(@Param("evId") Integer evId);

    @Query(value = "select count(*) from users_evs where ev_id = ?1", nativeQuery = true)
    int findEVCountByDistinctEVId(Long evId);
}
