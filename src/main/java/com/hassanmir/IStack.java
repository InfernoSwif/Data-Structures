package com.hassanmir;

public interface IStack<E> {

    public int size();

    public boolean isEmpty();

    public void push( E element);

    public E pop();

    public E peek();
}
