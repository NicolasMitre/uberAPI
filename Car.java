package com.company;

public class Car {

    public Car(String model, String color, String brand, String plate) {
        this.model = model;
        this.color = color;
        this.brand = brand;
        this.plate = plate;
    }

    private String model;
    private String color;
    private String brand;
    private String plate;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public static void realTimeLocation(Location location){

    }


}
