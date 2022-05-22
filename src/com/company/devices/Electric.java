package com.company.devices;

public class Electric extends Car {



    public Electric(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    public void refuel(){
        System.out.println("Auto elektryczne zostalo naladowane");

    }
}
