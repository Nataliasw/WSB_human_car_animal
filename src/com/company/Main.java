package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {

 //Animal

        Animal dog = new Animal("cannis");
        dog.isAlive = true;
        dog.name = "Szarik";

        System.out.println(dog.name);
        System.out.println("species: " + dog.species + " name: " + dog.name);

        Animal cat = new Animal("felis");

        cat.isAlive = true;
        cat.name = "Kotek";


        System.out.println("Ten kot to " + cat.name);
//Phone
        Phone iPhone = new Phone();

        iPhone.producer = "Apple";
        iPhone.model = "10X";
        iPhone.screeSize = 10.1;
        iPhone.os = "IOS";

        System.out.println("This iPhone is produced by " + iPhone.producer);

        Phone nokia = new Phone();
        nokia.producer = "Nokia";
        nokia.model = "3110i";
        nokia.screeSize = 8.1;
        nokia.os = "Android";

        System.out.println("Nokia has a model " + nokia.model);
//Feed dog
        dog.feed();
        dog.feed();
        dog.feed();
        System.out.println("Dog weight is " + dog.getWeight());


        dog.takeForWalk();
        dog.takeForWalk();
        System.out.println("Dog weight after walk is "+ dog.getWeight());
//Human
        Human natalia = new Human();
        natalia.firstname= "Natalia";
        natalia.lastname= "swiercz";
        natalia.pet = dog;
        natalia.mobile = new Phone();
        natalia.pet.feed();
        System.out.println(natalia.pet.name);
//Car
        //natalia.car = new Car("stinger","kia");
        //natalia.car.color = "red";
        //natalia.car.millage = 10000.0;
        natalia.mobile.model = "Xiaomi";
        natalia.mobile.producer = "Xiaomi";
//New car
        //natalia.car = new Car("passat","vw");
        //System.out.println(natalia.car.color);
        Car fiat = new Car("bravo","fiat");
//Salary
        natalia.setSalary(1000.0);

natalia.getSalary();


        int j = 2;
        long l = 123435564;
        short s = 32;
        boolean b = true;
        float f = 32.222f;
        double d = 32.323;
        char c = 'c';
        byte bt;

natalia.setCar(new Car ("bravo", "fiat"));


    }




}
