package com.company.creatures;

import com.company.devices.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class Human extends Animal {
    public String firstname;
    public String lastname;
    public Phone mobile;
    public Animal pett;
    public int garageCapacity;
    public Car[] garage;
    public Double salary;
    public Double cash = 0.0;

    public Human(int garageCapacity) {

        super("homo sapiens");
        garage = new Car[garageCapacity];
    }

    public String toString() {
        return firstname + " " + lastname + " " + age;
    }

    public Car getCar(int number) {
        return this.garage[number];

    }

    public void setCar(Car car, int number) {
        if (this.salary > car.value) {
            System.out.println("Samochod kupiony za gotowke");
            this.garage[number] = car;
        } else if (this.salary > car.value / 12.0) {
            System.out.println("Samochod kupiony na kredyt");
            this.garage[number] = car;
        } else {
            System.out.println("Zapisz sie na studia albo poproś o podwyżkę");

        }
    }


    public Double getSalary() {
        LocalDateTime Datetime = LocalDateTime.now();
        System.out.println("Dane o wyplacie byly pobrane " + Datetime);
        System.out.println(salary);
        return this.salary;
    }

    public void setSalary(Double salary) {

        if (salary < 0) {
            System.out.println("Salary cannot be less than 0");
        } else {
            System.out.println("New data in system for salary");
            System.out.println("Please take annex from HR");
            System.out.println("ZUS and US know about new salary");
            this.salary = salary;
        }


    }

    public double garageValue() {
        double value = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            value = garage[i].value + value;
        }
        return value;
    }

    public void sortGarage(){
        Arrays.sort(this.garage);
        System.out.println(Arrays.toString(this.garage));
    }
    ;


}
