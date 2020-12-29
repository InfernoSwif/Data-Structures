package com.hassanmir;


import com.hassanmir.AnimalQueue.*;
import org.junit.Assert;
import org.junit.Test;

public class AnimalQueueTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCatOrDogOnly(){
        Animal aNonSpecificAnimal = new Animal(5,"Red",1);
        AnimalQueue q = new AnimalQueue();
        q.enqueue(aNonSpecificAnimal);
    }

    @Test
    public void testSystemAnimalQueue(){
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();

        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        AnimalQueue q = new AnimalQueue();

        q.enqueue(c1);
        q.enqueue(c2);

        q.enqueue(d1);
        q.enqueue(d2);

        q.enqueue(c3);
        q.enqueue(d3);

        Assert.assertEquals(6,q.getSize());
        //c1 -> c2 -> d1 -> d2 -> c3 -> d3
        Assert.assertEquals(c1, q.dequeueAny());
        Assert.assertEquals(d1, q.dequeueDog());
        Assert.assertEquals(c2, q.dequeueAny());

        Assert.assertEquals(3,q.getSize());
        //d2 -> c3 -> d3
        Assert.assertEquals(c3, q.dequeueCat());
        Assert.assertEquals(d2, q.dequeueAny());
        Assert.assertEquals(d3, q.dequeueDog());
    }
}
