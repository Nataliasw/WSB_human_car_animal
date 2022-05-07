package com.company.devices;

public class Car {
    final String model;
    final String producer;
    String color;
    Double millage;
    Double weighting = 1500.0;
    public Double value = 500.0;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String toString(){
        return model+" "+producer;
    }
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Car car = (Car) o;
        return model.equals(car.model) && producer.equals(car.producer) ;

    }

}
