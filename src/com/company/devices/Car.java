package com.company.devices;

import com.company.Sellable;
import com.company.creatures.Human;
import org.jetbrains.annotations.NotNull;

public class Car extends Device implements Rechargeable, Sellable {
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

    public void sell(@NotNull Human seller, Human buyer, Double price) {
        if (seller.car != null) {
            if (buyer.salary >= price) {
                seller.salary += price;
                buyer.salary -= price;
                seller.mobile = null;
                System.out.println("transakcja przebiegla pomyslnie");
            } else {
                System.out.println("nie masz tyle kasy zeby kupic auto");
            }

        }
    }

}
