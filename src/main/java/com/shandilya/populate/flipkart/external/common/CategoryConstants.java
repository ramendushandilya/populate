package com.shandilya.populate.flipkart.external.common;

public enum CategoryConstants {

    AIRCONDITIONER("AirConditioners"),
    AIRCOOLERS("AirCoolers"),
    AUDIOPLAYER("AudioPlayers"),
    AUTOMOTIVES("Automotive"),
    ;

    private final String text;

    CategoryConstants(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return this.text;
    }
}
