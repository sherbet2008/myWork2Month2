package com.company;

public class Bmw extends Car implements  Printable {

private Double speed;
private int power;



    public Bmw(String model,double volume,Double speed,int power) {
        super(model,volume);
    this.speed=speed;
    this.power=power;

    }

    public Double getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }
public  void print(){

    System.out.println( getVolume()+ " "+  getModel() + "  " + getSpeed() + " " + getPower());


    }

}
