package com.hassanmir;

public class DynamicArray<E> {
    private E[] array;
    private int capacity=0;
    private int size=0;

    public DynamicArray(int capacity){
        if(capacity<1)
            throw new IllegalArgumentException();
        this.capacity = capacity;
        array = (E[]) new Object[capacity];
    }

    public DynamicArray(){
        new DynamicArray<E>(1);
    }

    public int size(){
        return size;
    }

    public int capacity(){
        return capacity;
    }

    public boolean isEmpty(){
        return size==0;
    }

    //Double the capacity each time the capacity is reached
    public void add(E element){
        if(size==capacity){
            capacity *=2;
            E[] array2 = (E[]) new Object[capacity];
            if (size >= 0) System.arraycopy(array, 0, array2, 0, size);
            array2[size]=element;
            array=array2;
        }else{
            array[size]=element;
        }
        size++;
    }

    public E get(int index){
        if(index<0 || index>size) throw new IndexOutOfBoundsException();
        return array[index];
    }

    public void set(int index, E element){
        if(index<0 || index>size) throw new IndexOutOfBoundsException();
        array[index] = element;
    }

    public int indexOf(Object obj){
        for(int i=0;i<size;i++){
            if(array[i].equals(obj))
                return i;
        }
        return -1;
    }

    //Iterate through till removing index is reached then skip
    public void removeAt(int index){
        E[] array2 = (E[]) new Object[capacity*2];
        int j=0;
        for(int i=0;i<size;i++){
            if(i!=index) {
                array2[j] = array[i];
                j++;
            }
        }
        array=array2;
        size--;
    }

    public boolean remove(Object obj){
        int index = indexOf(obj);
        if(index!=-1){
            removeAt(index);
            return true;
        }
        return false;
    }

    public boolean contains(Object obj){
        if(indexOf(obj)==-1) return false;
        return true;
    }

    @Override
    public String toString(){
        if(size==0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i=0;i<size-1;i++) sb.append(array[i] + ",");
        return sb.append(array[size-1]+"]").toString();
    }

}
