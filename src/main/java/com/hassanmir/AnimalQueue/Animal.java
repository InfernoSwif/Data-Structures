package com.hassanmir.AnimalQueue;

public class Animal {
    int weight;
    String colour;
    int healthRank;

    //could also make this class abstract, but kept for test.
    public Animal(int weight, String colour, int healthRank){
        this.weight = weight;
        this.colour = colour;
        this.healthRank = healthRank;
    }

}
