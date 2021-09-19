package com.codecool.projectegrandebackend.model;

public enum DietType {
    VEGETARIAN("vegetarian"),
    LACTOVEGETARIAN("lacto-vegetarian"),
    OVOVEGETARIAN("ovo-vegetarian"),
    VEGAN("vegan"),
    PESCETARIAN("pescetarian"),
    PALEO("paleo"),
    PRIMAL("primal");

    private String dietType;

    private DietType(String type) {
        this.dietType = type;
    }

    public String getDietType() {
        return dietType;
    }
}
