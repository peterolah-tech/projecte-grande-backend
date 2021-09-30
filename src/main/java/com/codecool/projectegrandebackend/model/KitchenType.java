package com.codecool.projectegrandebackend.model;

public enum KitchenType {
    CHINESE("chinese"),
    FRENCH("french"),
    GREEK("greek"),
    INDIAN("indian"),
    ITALIAN("italian"),
    JAPANESE("japanese"),
    KOREAN("korean"),
    MEDITERRANEAN("mediterranean"),
    MEXICAN("mexican"),
    MIDDLEEASTERN("middle eastern"),
    NORDIC("nordic"),
    THAI("thai"),
    VIETNAMESE("vietnamese");

    private String type;

    KitchenType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
