package com.company;

import com.company.devices.*;
import com.company.creatures.*;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


//Phone
        Phone iPhone = new Phone("Apple", "10X", 2010);


        iPhone.screenSize = 10.1;
        iPhone.os = "IOS";

        System.out.println("This iPhone is produced by " + iPhone.producer);

        Phone nokia = new Phone("nokia", "2344", 2000);

        nokia.screenSize = 8.1;
        nokia.os = "Android";

        System.out.println("Nokia has a model " + nokia.model);


//Human
        Human natalia = new Human();
        natalia.firstname = "Natalia";
        natalia.lastname = "swiercz";
        natalia.mobile = new Phone("nokia", "3320", 1999);


//Car
        //natalia.car = new Car("stinger","kia");
        //natalia.car.color = "red";
        //natalia.car.millage = 10000.0;

//New car
        //natalia.car = new Car("passat","vw");
        //System.out.println(natalia.car.color);
        Car fiat = new LPG("bravo", "fiat", 1980);
//Salary
        natalia.setSalary(1000.0);

        natalia.getSalary();

        int a = 2;
        int j = 2;
        long l = 123435564;
        short s = 32;
        boolean b = true;
        float f = 32.222f;
        double d = 32.323;
        char c = 'c';
        byte bt;

        natalia.setCar(new Diesel("bravo", "fiat", 2000));

        Human marek = new Human();
        marek.firstname = "Marek";
        marek.lastname = "Markowicz";
        marek.setSalary(1000.0);

        natalia.feed();


        marek.setCar(new Electric("bravo", "fiat", 1997));

        System.out.println(natalia.getCar().equals(marek.getCar()));
        System.out.println(natalia.getCar());
        System.out.println(marek.getCar());
        System.out.println(marek);

//Klasy i dziedziczenie

        natalia.getCar().turnOn();
//sprawdzanie czy obiekt jest jakas klasa
        System.out.println(natalia.getCar() instanceof Car);
        System.out.println(natalia.getCar() instanceof Device);

        Pet szarik = new Pet("felis");
        Animal bird = new Pet("felis");
        bird.feed(0.1);
//sell
        Human kacper = new Human();

        Human brotherInLaw = new Human();
        brotherInLaw.cash = 20000.0;
        Phone iphone = new Phone("iphone", "10", 2010);
        kacper.mobile = iphone;
        Pet pett = new Pet("felis");
        Car passat1 = new LPG("bravo", "fiat", 1997);
        kacper.salary=100000.0;
        kacper.setCar(passat1);
//sell car
        try {
            passat1.sell(kacper, brotherInLaw, 1000.0);

        } catch (Exception e) {
            System.out.println("Nie udalo sie sprzedac");
            e.printStackTrace();

        }
        try {
            fiat.sell(kacper, brotherInLaw, 1000.0);

        } catch (Exception e) {
            System.out.println("Nie udalo sie sprzedac");
        }
//sell phone
        try {
            iphone.sell(kacper, brotherInLaw, 1000.0);

        } catch (Exception e) {
            System.out.println("Nie udalo sie sprzedac");
        }


        Human buyer = new Human();
        buyer.setSalary(2000.0);
//INSTALL APP

        iphone.installAnApp("Youtube","10.2","sklep");
        iphone.installAnApp("Youtube");
        iphone.installAnApp("Youtube","10.2");


    }
}
