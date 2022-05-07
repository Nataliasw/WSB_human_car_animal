package com.company.devices;

public class Phone extends Device implements Rechargeable{

    public Double screenSize;
    public String os;

    public Phone(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("telefon wlaczony");
    }


    @Override
    public void recharge() {
        System.out.println("znajdz ladowarke");
        System.out.println("znajdz wolne gniazdko");
        System.out.println("laduje");
        System.out.println("naladowane");
    }
}
