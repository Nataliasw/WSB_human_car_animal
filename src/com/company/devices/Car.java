package com.company.devices;


import com.company.creatures.Human;
import org.jetbrains.annotations.NotNull;
import com.company.Sellable;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public abstract class Car extends Device implements Rechargeable, Sellable, Comparable<Car> {
    String color;
    Double millage;
    Double weighting = 1500.0;
    public double value;
    public List<Human> owners;


    public Car(String producer, String model, int yearOfProduction, double value) {
        super(producer, model, yearOfProduction, value);
        owners = new LinkedList<Human>();
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


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return model.equals(car.model) && producer.equals(car.producer);

    }

    public void turnOn() {
        System.out.println("Urzadzenie zostalo wlaczone");

    }


    @Override
    public void recharge() {
        System.out.println("podjedz na stacje");
        System.out.println("zatankuj");
        System.out.println("zaplac");
    }

    public void sell(@NotNull Human seller, Human buyer, Double price) throws Exception {
        if (!Arrays.asList(seller.garage).contains(this) && owners.get(owners.size() - 1) != seller) {

            throw new Exception("Sprzedawca nie ma samochodu, ktory chce sprzedac ");

        }
        if (buyer.garage.length == buyer.garageCapacity) {
            throw new Exception("Kupujacy nie ma miejsca w garazu");
        }
        if (buyer.cash < price) {
            throw new Exception("Kupujący nie ma kasy");
        }
        seller.cash += price;
        buyer.cash -= price;

        for (int i = 0; i < buyer.garage.length; i++)
            if (buyer.garage[i] == null) {
                buyer.garage[i] = this;
                break;
            }
        int indexOfCar = Arrays.asList(seller.garage).indexOf(this);
        seller.garage[indexOfCar] = null;
        owners.add(buyer);
        System.out.println("transakcja przebiegla pomyslnie");


    }


    public int compareTo(Car o) {
        if (this.yearOfProduction != o.yearOfProduction) {
            return this.yearOfProduction - o.yearOfProduction;
        }
        return this.producer.compareTo(o.producer);
    }



    public boolean checkForOwner(Human owner){
       return owners.contains(owner);

    }

    public boolean checkIfSoldTo(Human owner1, Human owner2){
        if(!owners.contains(owner1) || !owners.contains(owner2)){
            return false;
        }
        if(owners.indexOf(owner1) +1 != owners.indexOf(owner2)){
            return false;
        }
        return true;
    }
    public int numberOfTransactions(){

        return owners.size() -1;
    }

}
