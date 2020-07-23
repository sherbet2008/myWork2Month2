package com.company;

class Car implements Printable {


    private String model;
    private double volume;

    public Car(String model, double volume) {
        this.model = model;
        this.volume = volume;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }


    public String getModel() {
        return model;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void print() {


    }
}
