package com.company.creatures;

public class Pet extends Animal{
    String owner;
    String City;

    public Pet(String species) {
        super(species);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "owner='" + owner + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
