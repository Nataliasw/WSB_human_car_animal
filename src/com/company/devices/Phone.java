package com.company.devices;

import com.company.Sellable;
import com.company.creatures.Human;
import org.jetbrains.annotations.NotNull;

public class Phone extends Device implements Rechargeable, Sellable {

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


    public void sell(@NotNull Human seller, Human buyer, Double price) {
        if (seller.mobile != null) {
            if (buyer.salary >= price) {
                seller.salary += price;
                buyer.salary -= price;
                seller.mobile = null;
                System.out.println("transakcja przebiegla pomyslnie");
            } else {
                System.out.println("nie masz tyle kasy zeby kupic telefon");
            }

        }
    }
}
