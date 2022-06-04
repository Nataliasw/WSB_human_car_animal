package com.company.devices;

import com.company.creatures.Human;

public class Electric extends Car {



    public Electric(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    }

    public void refuel(){
        System.out.println("Auto elektryczne zostalo naladowane");

    }


}
