package com.company;

public class Trip {

    public Trip(Enum status, boolean paid, float approximatedFare, float finalFare, int travelTime, int waitTime) {
        this.status = status;
        this.paid = paid;
        this.approximatedFare = approximatedFare;
        this.finalFare = finalFare;
        this.travelTime = travelTime;
        this.waitTime = waitTime;
    }

    private Enum status;
    private boolean paid;
    private float approximatedFare;
    private float finalFare;
    private int travelTime;
    private int waitTime;

    public Enum getStatus() {
        return status;
    }

    public void setStatus(Enum status) {
        this.status = status;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public float getApproximatedFare() {
        return approximatedFare;
    }

    public void setApproximatedFare(float approximatedFare) {
        this.approximatedFare = approximatedFare;
    }

    public float getFinalFare() {
        return finalFare;
    }

    public void setFinalFare(float finalFare) {
        this.finalFare = finalFare;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }





}
