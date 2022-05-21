package com.company.creatures;
import com.company.devices.*;
import java.time.LocalDateTime;

public class Human extends Animal {
    public String firstname;
    public String lastname;
    public Phone mobile;
    public Animal pett;
    public Car car;
    public Double salary;
    int cash;

    public Human(){
        super("homo sapiens");
   }

    public String toString(){
        return firstname+" "+lastname+" "+age;
    }

     public Car getCar(){
         return this.car;

     }

     public void setCar(Car car){
         if(this.salary > car.value){
             System.out.println("Samochod kupiony za gotowke");
             this.car = car;
         } else if (this.salary > car.value/12.0){
             System.out.println("Samochod kupiony na kredyt");
             this.car = car;
         } else {
             System.out.println("Zapisz sie na studia albo poproś o podwyżkę");

         }
     }


    public Double getSalary(){
        LocalDateTime Datetime = LocalDateTime.now();
        System.out.println("Dane o wyplacie byly pobrane " +Datetime);
        System.out.println(salary);
        return this.salary;
    }

    public void setSalary(Double salary){

       if(salary<0){
           System.out.println("Salary cannot be less than 0");
       }
       else {
           System.out.println("New data in system for salary");
           System.out.println("Please take annex from HR");
           System.out.println("ZUS and US know about new salary");
           this.salary = salary;
       }




    }



}
