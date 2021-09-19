package com.codecool.projectegrandebackend.model;

public class EV {
    private String address;
    private float latitude;
    private float longitude;
    private String title;

    public EV(){

    }
    public EV(String address){
        this.address = address;
    }

    public EV(String address, float latitude, float longitude, String title) {
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float lattitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
