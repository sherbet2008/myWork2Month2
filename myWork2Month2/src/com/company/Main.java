package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        createObject("Audio").print();

        createObject("Lexus").print();
       createObject("Bmw").print();
        createObject("Audio").print();
    }


    public static Printable createObject(String className) {
        Printable print = null;

        switch (className) {

            case "Lexus":

                print = new Lexus("",2.2,9,10,"");
                System.out.println(" it ");
                break;
            case "Bmw":
                print = new Bmw("",8.7,200.5,500);
                System.out.println(" or ");
                break;

            case "Audio":
                print = new Audio("",9.9,40,"auto");
                System.out.println(" isIt ");
                break;


        }
        return print;


    }


    }

