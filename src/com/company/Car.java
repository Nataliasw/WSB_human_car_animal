package com.company;

public class Car {
    final String model;
    final String producer;
    String color;
    Double millage;
    Double weighting = 1500.0;
    Double value = 500.0;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }
}
