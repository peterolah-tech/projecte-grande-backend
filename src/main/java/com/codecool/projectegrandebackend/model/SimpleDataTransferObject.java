package com.codecool.projectegrandebackend.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimpleDataTransferObject {

    @JsonProperty
    String response;

    public SimpleDataTransferObject(String response) {
        this.response = response;
    }
}
