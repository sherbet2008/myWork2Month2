package com.company;

public class Audio extends Car implements Printable {
private String control;
private  int size;

    public Audio(String model,double volume, int size,String control) {
        super(model,volume);
    this.control=control;
    this.size=size;

    }

    public String getControl() {
        return control;
    }

    public int getSize() {
        return size;
    }
public void print(){

    System.out.println(getVolume()+ " " + " model  "+getModel() +" " + getControl()+ " " +getSize());
}


}
