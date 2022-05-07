package com.company.creatures;

public class Animal {
    static final Double DEFAULT_WEIGHT = 5.0;
    static final Double DEFAULT_CAT_WEIGHT =2.0;
    static final Double DEFAULT_DOG_WEIGHT = 3.0;
    public final String species;
    private Double weight = 10.0;
    Integer age;
    public String name;
    public Boolean isAlive;


    public Animal(String species) {
        this.isAlive = true;
        this.age = 1;
        this.species = species;


        switch (this.species) {
            case "felis":
                this.weight = DEFAULT_CAT_WEIGHT;
                break;
            case "canis":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            default:
                this.weight = DEFAULT_WEIGHT;
                break;
        }

    }

    public String toString(){
        return species+" "+name+" "+age+" "+weight;
    }

    public Double getWeight(){
        return this.weight;
    }


    public void feed() {

        if (isAlive) {
            weight += 1.0;
            System.out.println("thx for food.");

        } else {
            System.out.println("Dog is dead");
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void takeForWalk() {
        if (isAlive) {
            weight -= 1.0;
            System.out.println("nice walk, thx");
            if (weight <= 0) {
                isAlive = false;
            }
        } else {
            System.out.println("Dog is dead");
        }
    }
}