package com.codecool.projectegrandebackend.model.generated.transport;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class TransportStat {

    private String name;
    private double avgCO2;
    private double yourCO2;
}
