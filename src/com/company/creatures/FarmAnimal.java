package com.company.creatures;

public class FarmAnimal extends Animal implements Edible{

    boolean givesMilk;
    boolean givesEggs;



    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public String toString() {
        return "FarmAnimal{" +
                "givesMilk=" + givesMilk +
                ", givesEggs=" + givesEggs +
                '}';
    }


    @Override
    public void beEaten() {
        this.isAlive = false;
        this.weight = 0.0;
        System.out.println("ugotuj");
        System.out.println("zjedz");

    }
}
