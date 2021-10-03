package com.codecool.projectegrandebackend.repository;

import com.codecool.projectegrandebackend.model.EV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

public interface EVRepository extends JpaRepository<EV, Long> {

    EV findEVByEvId(Integer evId);


    @Transactional
    @Modifying
    @Query("update EV e set e.favorite = ?1 where e.evId=?2")
     void updateFavoriteByEvId(boolean favorite, Integer evId);
}
