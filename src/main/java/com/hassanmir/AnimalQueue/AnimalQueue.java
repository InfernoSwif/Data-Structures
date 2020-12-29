package com.hassanmir.AnimalQueue;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class AnimalQueue {
    private LinkedList<Animal> q = new LinkedList<>();
    private int size = 0;

    public AnimalQueue(){}

    public void enqueue(Animal A){
        if(!(A instanceof Cat || A instanceof Dog))
            throw new IllegalArgumentException();
        q.add(A);
        size++;
    }

    public Animal dequeueAny(){
        if(size==0)
            throw new EmptyStackException();
        size--;
        return q.removeFirst();
    }

    public Cat dequeueCat(){
        if(size==0)
            throw new EmptyStackException();
        for(int i=0;i<size;i++)
            if(q.get(i) instanceof Cat) {
                size--;
                return (Cat) q.remove(i);
            }
        return null;
    }

    public Dog dequeueDog(){
        if(size==0)
            throw new EmptyStackException();
        for(int i=0;i<size;i++)
            if(q.get(i) instanceof Dog) {
                size--;
                return (Dog) q.remove(i);
            }
        return null;
    }

    public int getSize(){
        return size;
    }

    public Animal peek(){
        return q.peek();
    }
}
