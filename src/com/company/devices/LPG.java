package com.company.devices;

public class LPG extends Car{

    public LPG(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);

    }
    public void refuel(){
        System.out.println("Auto na gaz zostalo zatankowane");

    }
}
