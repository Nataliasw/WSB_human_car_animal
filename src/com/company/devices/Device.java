package com.company.devices;


public abstract class Device  {
    final public String producer;
    final public String model;
    final public int yearOfProduction;
    public double value;

    public Device(String producer, String model, int yearOfProduction, double value) {
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
                ",value=" + value +
                '}';
    }

    public abstract void turnOn();



 }


