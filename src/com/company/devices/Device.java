package com.company.devices;

public class Device {
    final public String producer;
    final public String model;
    final public int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }


    public void turnOn(){
        System.out.println("Urzadzenie zostalo wlaczone");

    }
}
