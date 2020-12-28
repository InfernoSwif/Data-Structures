package com.hassanmir;

public interface IQueue<E> {
    public void offer(E element);

    public E poll();

    public E peek();

    public int size();

    public boolean isEmpty();
}

