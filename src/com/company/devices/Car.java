package com.company.devices;


import com.company.creatures.Human;
import org.jetbrains.annotations.NotNull;
import com.company.Sellable;

import java.util.List;


public abstract class Car extends Device implements Rechargeable, Sellable, Comparable<Car> {
    String color;
    Double millage;
    Double weighting = 1500.0;
    public double value;
    public List<Human> owners;



    public Car(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
    }


    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ",model='" + model + '\'' +
                ",yearOfProduction='" + yearOfProduction + '\'' +
                ",value=" + value +
                ",color='" + color + '\'' +
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


    @Override
    public void recharge() {
        System.out.println("podjedz na stacje");
        System.out.println("zatankuj");
        System.out.println("zaplac");
    }

    public void sell(@NotNull Human seller, Human buyer, Double price, int number) throws Exception {
        if (seller.getCar(number) != this) {
            throw new Exception("Sprzedawca nie ma samochodu w tym miejscu w garazu");

        }
        if(buyer.garage.length == buyer.garageCapacity ){
            throw new Exception("Kupujacy nie ma miejsca w garazu");
        }
        if(buyer.cash < price){
            throw new Exception("Kupujący nie ma kasy");
        }
        seller.cash += price;
        buyer.cash -= price;

        for(int i = 0; i < buyer.garage.length; i++)
            if(buyer.garage[i] == null) {
                buyer.garage[i] = this;
                break;
            }
        seller.garage[number]=null;
        System.out.println("transakcja przebiegla pomyslnie");


    }


        public int compareTo(Car o){
            if(this.yearOfProduction != o.yearOfProduction){
                return this.yearOfProduction - o.yearOfProduction;
            }
            return this.producer.compareTo(o.producer);
        };



}
