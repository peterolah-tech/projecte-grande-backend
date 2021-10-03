package com.codecool.projectegrandebackend.model.generated.recipes;

public enum TrackedIngredients {

    // In parenthesis: greenhouse gas emissions (in kg CO2) produced by one kilo of each food
    // https://www.greeneatz.com/foods-carbon-footprint.html

    // Could get a separate API for this as well:
    // e.g. https://eaternity.org/foodprint/database

    LAMB(39.2),
    BEEF(27),
    CHEESE(13.5),
    PORK(12.1),
    TURKEY(10.9),
    CHICKEN(6.9),
    TUNA(6.1),
    EGGS(4.8),
    VEGETALBES(2.0);

    private final double co2Equivalent;

    TrackedIngredients(double co2Equivalent) {
        this.co2Equivalent = co2Equivalent;
    }

    public double getCo2Equivalent() {
        return co2Equivalent;
    }
}
