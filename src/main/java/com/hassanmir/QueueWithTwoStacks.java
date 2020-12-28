package com.hassanmir;

public class QueueWithTwoStacks<E> implements IQueue<E> {

    Stack<E> s1 = new Stack<>();
    Stack<E> s2 = new Stack<>();

    @Override
    public void offer(E element) {
        while(!s1.isEmpty())
            s2.push(s1.pop());

        s1.push(element);

        while(!s2.isEmpty())
            s1.push(s2.pop());
    }

    @Override
    public E poll() {
        return s1.pop();
    }

    @Override
    public E peek() {
        return s1.peek();
    }

    @Override
    public int size() {
        return s1.size();
    }

    @Override
    public boolean isEmpty() {
        return s1.size()==0;
    }
}
