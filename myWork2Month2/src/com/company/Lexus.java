package com.company;

public class Lexus extends Car implements Printable {
private int year;
private int mark;
private String className;
    public Lexus( String model,double volume,int year, int mark,String className) {
       super(model,volume);

        this.year = year;
        this.mark = mark;
        this.className=className;
    }

    @Override
    public void print() {
        System.out.printf(" год выпуска " + getYear()," Марка машины " + getMark() + " что-то " + getClassName());
    }

    public int getYear() {
        return year;
    }

    public String getClassName() {
        return className;
    }

    public int getMark() {
        return mark;


    }
}
