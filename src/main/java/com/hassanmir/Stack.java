package com.hassanmir;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<E> implements IStack<E>  {

    LinkedList<E> list = new LinkedList<E>();

    public Stack(){}

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(E element) {
        list.add(element);
    }

    @Override
    public E pop() {
        if(isEmpty()) throw new EmptyStackException();
        return list.removeLast();
    }

    @Override
    public E peek() {
        return list.getLast();
    }
}
