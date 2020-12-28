package com.hassanmir;

import java.util.LinkedList;

public class Queue<E> implements IQueue<E> {

    LinkedList<E> list = new LinkedList<>();

    @Override
    public void offer(E element) {
        list.add(element);
    }

    @Override
    public E poll() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return list.removeFirst();
    }

    @Override
    public E peek() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return list.getFirst();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.size()==0;
    }
}
