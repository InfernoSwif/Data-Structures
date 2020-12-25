package com.hassanmir;

public class DynamicArray<E> {
    E[] array;
    int capacity;
    int size;

    public DynamicArray(int capacity){
        if(capacity<1)
            throw new IllegalArgumentException();
        this.capacity = capacity;
        array = (E[]) new Object[capacity];
    }

    public DynamicArray(){
        new DynamicArray(1);
    }

    public static void main(String[] args){
        DynamicArray<Integer> arr = new DynamicArray<>(5);
        System.out.println("capacity is: " + arr.capacity);
    }
}
