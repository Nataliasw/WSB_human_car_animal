package com.company;
import com.company.devices.*;
import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) {


//Phone
        Phone iPhone = new Phone("Apple","10X",2010);


        iPhone.screenSize = 10.1;
        iPhone.os = "IOS";

        System.out.println("This iPhone is produced by " + iPhone.producer);

        Phone nokia = new Phone("nokia","2344",2000);

        nokia.screenSize = 8.1;
        nokia.os = "Android";

        System.out.println("Nokia has a model " + nokia.model);




//Human
        Human natalia = new Human();
        natalia.firstname= "Natalia";
        natalia.lastname= "swiercz";
        natalia.mobile = new Phone("nokia","3320",1999);


//Car
        //natalia.car = new Car("stinger","kia");
        //natalia.car.color = "red";
        //natalia.car.millage = 10000.0;

//New car
        //natalia.car = new Car("passat","vw");
        //System.out.println(natalia.car.color);
        Car fiat = new Car("bravo","fiat",1980);
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

natalia.setCar(new Car ("bravo", "fiat",2000));

Human marek = new Human();
marek.firstname= "Marek";
marek.lastname= "Markowicz";
marek.setSalary(1000.0);

natalia.feed();


marek.setCar(new Car ("bravo", "fiat",1997));

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

    }



}
