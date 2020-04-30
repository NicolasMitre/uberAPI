package com.company;

public class Location {
    public Location(String address, String city, double gpsLocation) {
        this.address = address;
        this.city = city;
        this.gpsLocation = gpsLocation;
    }

    private String address;
    private double gpsLocation;
    private String city;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpsLocation() {
        return gpsLocation;
    }

    public void setGpsLocation(double gpsLocation) {
        this.gpsLocation = gpsLocation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
