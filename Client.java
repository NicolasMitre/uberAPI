package com.company;

public class Client {
    public Client(String username, String password) {
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void addLocation(Location location){
    }

    public static void getLocation(){
    }

    public static void deleteLocation(Location location){
    }

    public static void requestTrip(Location initialLocation, Location finalLocation){
    }

    public static void payTrip(){
    }
}
