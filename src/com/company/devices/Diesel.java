package com.company.devices;

public class Diesel extends Car{

    public Diesel(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void refuel(){
        System.out.println("Diesel zostal zatankowany");

    }
}
