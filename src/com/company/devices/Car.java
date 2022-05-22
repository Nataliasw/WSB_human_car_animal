package com.company.devices;

import com.company.Sellable;
import com.company.creatures.Human;
import org.jetbrains.annotations.NotNull;

public abstract class Car extends Device implements Rechargeable, Sellable {
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

    public abstract void refuel();


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
    public void turnOn()
    {System.out.println("Urzadzenie zostalo wlaczone");

    }
     public int compareTo(Car car ){
         return (int) (this.millage - car.millage);
     }

    @Override
    public void recharge() {
        System.out.println("podjedz na stacje");
        System.out.println("zatankuj");
        System.out.println("zaplac");
    }

    public void sell(@NotNull Human seller, Human buyer, Double price) throws Exception {
        if (seller.getCar() != this) {
            throw new Exception("Sprzedawca nie ma samochodu");

        }
        if(buyer.cash < price){
            throw new Exception("Kupujący nie ma kasy");
        }
        seller.cash += price;
        buyer.cash -= price;
        buyer.car = this;
        seller.car=null;
        System.out.println("transakcja przebiegla pomyslnie");


        }


}
