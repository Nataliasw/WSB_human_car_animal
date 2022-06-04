package com.company;

import com.company.devices.*;
import com.company.creatures.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//Phone
//        Phone iPhone = new Phone("Apple", "10X", 2010);
//
//
//        iPhone.screenSize = 10.1;
//        iPhone.os = "IOS";
//
//        System.out.println("This iPhone is produced by " + iPhone.producer);
//
//        Phone nokia = new Phone("nokia", "2344", 2000);
//
//        nokia.screenSize = 8.1;
//        nokia.os = "Android";
//
//        System.out.println("Nokia has a model " + nokia.model);


//Human
//        Human natalia = new Human(7);
//        natalia.firstname = "Natalia";
//        natalia.lastname = "swiercz";
//        natalia.mobile = new Phone("nokia", "3320", 1999);
//

//Car
        //natalia.car = new Car("stinger","kia");
        //natalia.car.color = "red";
        //natalia.car.millage = 10000.0;

//New car
        //natalia.car = new Car("passat","vw");
        //System.out.println(natalia.car.color);
        Car fiat = new LPG("bravo", "fiat", 1980,1000);
//Salary
//        natalia.setSalary(1000.0);
//
//        natalia.getSalary();
//
//        int a = 2;
//        int j = 2;
//        long l = 123435564;
//        short s = 32;
//        boolean b = true;
//        float f = 32.222f;
//        double d = 32.323;
//        char c = 'c';
//        byte bt;
//
//        natalia.setCar(new Diesel("bravo", "fiat", 2000),2);
//
//        Human marek = new Human(3);
//        marek.firstname = "Marek";
//        marek.lastname = "Markowicz";
//        marek.setSalary(1000.0);
//
//        natalia.feed();

//
//        marek.setCar(new Electric("bravo", "fiat", 1997),1);
//
//        System.out.println(natalia.getCar(2).equals(marek.getCar(2)));
//        System.out.println(natalia.getCar(2));
//        System.out.println(marek.getCar(2));
//        System.out.println(marek);
//
////Klasy i dziedziczenie
//
//        natalia.getCar(2).turnOn();
////sprawdzanie czy obiekt jest jakas klasa
//        System.out.println(natalia.getCar(2) instanceof Car);
//        System.out.println(natalia.getCar(2) instanceof Device);
//
//        Pet szarik = new Pet("felis");
//        Animal bird = new Pet("felis");
//        bird.feed(0.1);
//sell
//        Human kacper = new Human(4);
//
//        Human brotherInLaw = new Human(4);
//        brotherInLaw.cash = 20000.0;
//        Phone iphone = new Phone("iphone", "10", 2010);
//        kacper.mobile = iphone;
//        Pet pett = new Pet("felis");
//        Car passat1 = new LPG("bravo", "fiat", 1997,1000);
//        kacper.salary = 100000.0;
//        kacper.setCar(passat1,2);
////sell car
//        try {
//            passat1.sell(kacper, brotherInLaw, 1000.0);
//
//        } catch (Exception e) {
//            System.out.println("Nie udalo sie sprzedac");
//            e.printStackTrace();
//
//        }
//        try {
//            fiat.sell(kacper, brotherInLaw, 1000.0);
//
//        } catch (Exception e) {
//            System.out.println("Nie udalo sie sprzedac");
//        }
////sell phone
//        try {
//            iphone.sell(kacper, brotherInLaw, 1000.0);
//
//        } catch (Exception e) {
//            System.out.println("Nie udalo sie sprzedac");
//        }
//
//
//        Human buyer = new Human(4);
//        buyer.setSalary(2000.0);
////INSTALL APP
//
//        iphone.installAnApp("Youtube", "10.2", "sklep");
//        iphone.installAnApp("Youtube");
//        iphone.installAnApp("Youtube", "10.2");
//
//
////TABLICE
////Zad1
//        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int k = 9; k >= 0; k--) {
//            System.out.println(nums[k]);
//
//        }
////Zad2
//        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
//
//        for (int k = 1; k < months.length; k += 2) {
//            System.out.println(months[k]);
//
//        }
//
////Zad3
//        Pet cat = new Pet("felis");
//        cat.name = "filus";
//        cat.age = 5;
//        Pet dog = new Pet("cannis");
//        dog.name = "szczek";
//        dog.age = 3;
//        FarmAnimal cow = new FarmAnimal("cow");
//        cow.name = "zosia";
//        cow.age = 3;
//        FarmAnimal horse = new FarmAnimal("horse");
//        Human ala = new Human(2);
//        Human karol = new Human(2);
//        ala.firstname = "Ala";
//        ala.lastname = "Nowak";
//
//        karol.firstname = "Karol";
//        karol.lastname = "Kowalski";
//
//        Animal anim[] = {cat, dog, cow, horse, ala, karol};
//
//        for (Animal an : anim) {
//            if (!(an instanceof Edible)) {
//                System.out.println(an);
//            }
//        }

//Zad 5

//        Scanner myObj = new Scanner(System.in);
//        System.out.println("Ile liczb chcesz podac? ");
//        int size = Integer.parseInt(myObj.nextLine());
//        int numbers[] = new int[size];
//        for (int k = 0; k < size; k++) {
//
//            System.out.println("Podaj liczbe numer " + (k + 1)+ "\n");
//            String number = myObj.nextLine();
//            numbers[k] = Integer.parseInt(number);
//
//        }
//        System.out.println("Nieposortowane liczby");
//        for (int n : numbers) {
//            System.out.println("Number= " + n);
//        }
//        Arrays.sort(numbers);
//
//        System.out.println("Posortowane liczby");
//        for (int n : numbers) {
//            System.out.println("Number= " + n);
//        }

//
//        //Zad 6
//        ArrayList<Animal> animals = new ArrayList<Animal>();
//        animals.add(cat);
//        animals.add(dog);
//        animals.add(cow);
//        ArrayList<Animal> newAnimals = animalStorage(animals);
//        if(animals.size() != newAnimals.size()) {
//            System.out.println("Dodano nowe zwierze: ");
//            System.out.println(newAnimals.get(newAnimals.size() -1));
//        }
//    }
//
//    public static ArrayList<Animal> animalStorage(ArrayList<Animal> animals) {
//
//        Scanner myObj = new Scanner(System.in);
//        System.out.println(" 1 - Dodaj nowe zwierze \n 2 - Wypisz liste zwierzat ");
//        int option = Integer.parseInt(myObj.nextLine());
//        if (option == 1) {
//            System.out.println("Podaj gatunek ");
//            String species = myObj.nextLine();
//            System.out.println("Podaj imie ");
//            String name = myObj.nextLine();
//            System.out.println("Podaj wiek ");
//            String age = myObj.nextLine();
//            Animal animal = new Animal(species);
//            animal.name = name;
//            animal.age = Integer.parseInt(age);
//            animals.add(animal);
//
//        }
//        if (option == 2) {
//            System.out.println(animals);
//
//        }
//        System.out.println("nieprawidlowa liczba");
//
//
//        return animals;

      Human natalia = new Human(3);
      natalia.setSalary(10000000.0);
      natalia.setCar(new Diesel("Toyta","Corolla",2020,10000.0),0);
      natalia.setCar(new LPG("Hyundai", "i30",2005,20000.0),1);
      natalia.setCar(new LPG("BMW", "GT3",2009,12000.0),2);

      natalia.sortGarage();








  }


}
