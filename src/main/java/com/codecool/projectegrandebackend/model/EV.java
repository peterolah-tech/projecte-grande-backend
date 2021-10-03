package com.codecool.projectegrandebackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class EV {
    @Id
    @GeneratedValue
    private Long id;

    private Integer evId;
    private String address;
    private String town;
    private double latitude;
    private double longitude;
    private String title;
    private boolean favorite;

}





