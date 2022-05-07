package com.company;
import com.company.devices.*;
import java.time.LocalDateTime;

public class Human {
    String firstname;
    String lastname;
    Integer age;
    Boolean isAlive;
    Phone mobile;
    Animal pet;
    private Car car;
    private Double salary;

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
        //walidacje
        //integracje
        //zapis do bazy danych
        //logi
        //powiadomienie
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
