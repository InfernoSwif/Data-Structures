package com.hassanmir.Trees;

import java.util.concurrent.ThreadLocalRandom;

public class BinarySearchTree<T extends Comparable<T>> {
    public Node<T> root;
    int size=0;

    public BinarySearchTree(){}

    public BinarySearchTree(T value){
        root.value = value;
        size++;
    }

    public int getSize(){return size;}
    public boolean isEmpty(){return size==0;}

    public boolean insert(T value){
        if(root==null){
            Node<T> n = new Node<>(value);
            root = n;
            size++;
            return true;
        }

        ///check if tree contains value already
        if(contains(root,value))
            return false;

        add(root, value);
        size++;
        return true;
    }

    private void add(Node<T> n, T value){
        if(n==null) return;
        if(value.compareTo(n.value) < 0) {
            if(n.left==null) {
                n.left = new Node<T>(value);
                return;
            }
            add(n.left,value);
        }
        if(value.compareTo(n.value) > 0) {
            if(n.right==null){
                n.right = new Node<T>(value);
                return;
            }
            add(n.right,value);
        }
    }

    public boolean contains(Node<T> n, T value){
        if(n==null)
            return false;

        if(n.value.compareTo(value)==0)
            return true;

        return contains(n.left,value) || contains(n.right,value);
    }

    public Node<T> find(T value){
        return find(root,value);
    }

    public Node<T> find(Node<T> n, T value){
        if(n==null) return null;
        if(value.compareTo(n.value)==0) return n;
        if(value.compareTo(n.value)<0) return find(n.left,value);
        if(value.compareTo(n.value)>0) return find(n.right,value);
        return null;
    }

    public boolean delete(T value){

        if(contains(root,value)){
            root = delete(root,value);
            size--;
            return true;
        }
        return false;
    }

    private Node<T> delete(Node<T> n, T value){
        if(n==null) return null;

        int compare = value.compareTo(n.value);

        if(compare<0){
            n.left = delete(n.left,value);
        }
        else if(compare>0){
            n.right = delete(n.right,value);
        }
        else{
            if(n.left==null && n.right==null)
                return null;
            if(n.left==null)
                return n.right;
            if(n.right==null)
                return n.left;

            // case when both children are present
            // replacement
            Node<T> rep = n.left;
            while(rep.right!=null)
                rep=rep.right;

            n.value = rep.value;

            n.left = delete(n.left,rep.value);
        }
        return n;
    }

    public int current = 0;
    public Node<T> getRandomNode(){
        current = 0;
        int random = ThreadLocalRandom.current().nextInt(0,size);
        return getValue(root, random);
    }

    private Node<T> getValue(Node<T> n, int target){
        if(current==target)
            return n;
        Node<T> x = null;
        Node<T> y = null;
        current++;
        if(n.left!=null && n.right!=null) {
            x = getValue(n.left,target);
            y = getValue(n.right,target);
        }
        else if(n.left!=null) {
            x = getValue(n.left,target);
        }
        else if(n.right!=null) {
            y = getValue(n.right,target);
        }

        if(x!=null) return x;
        if(y!=null) return y;
        return null;
    }

}
