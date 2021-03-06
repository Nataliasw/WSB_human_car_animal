package com.company.creatures;

import com.company.Sellable;

public  class Animal implements Feedable, Sellable {
    static final Double DEFAULT_WEIGHT = 5.0;
    static final Double DEFAULT_CAT_WEIGHT =2.0;
    static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final double DEFAULT_FOOD_WEIGHT = 1.0;
    public final String species;
    protected Double weight = 10.0;
    public int age;
    public String name;
    public Boolean isAlive = true;


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


    @Override
    public String toString() {
        return "Pet{" + species + " "  + " ,name= " + name +  " age= " + age +
                '}';
    }

    public Double getWeight(){
        return this.weight;
    }

@Override
    public void feed() {
     this.feed(DEFAULT_FOOD_WEIGHT);
    }
public void feed(double foodWeight){
    if (isAlive) {
        weight += foodWeight;
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

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception{
        if(seller.pett !=this || seller.pett instanceof Human ){
            throw new Exception("Sprzedawca nie ma zwierzaka");
        }
        if(buyer.salary < price){
            throw new Exception("Kupuj??cy nie ma kasy");
        }

        seller.salary += price;
        buyer.salary -= price;
        buyer.pett = seller.pett;
        seller.pett = null;
        System.out.println("transakcja przebiegla pomyslnie");




    }

}
