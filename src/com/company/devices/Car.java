package com.company.devices;

public class Car extends Device {
    String color;
    Double millage;
    Double weighting = 1500.0;
    public Double value = 500.0;

    public Car(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }


    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", millage=" + millage +
                ", weighting=" + weighting +
                ", value=" + value +
                '}';
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
