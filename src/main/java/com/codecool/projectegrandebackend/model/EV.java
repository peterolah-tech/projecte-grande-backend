package com.codecool.projectegrandebackend.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EV {
    private Integer evId;
    private String address;
    private String town;
    private double latitude;
    private double longitude;
    private String title;
    private boolean favorite;


}





