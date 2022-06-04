package com.company.devices;

import com.company.creatures.Human;

public class Diesel extends Car{

    public Diesel(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    }

    public void refuel(){
        System.out.println("Diesel zostal zatankowany");

    }


}
