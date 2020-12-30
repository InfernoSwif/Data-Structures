package com.hassanmir.Trees;

//Given a sorted array with unique integer elements, consturct a binary search tree with minimal height
public class MinimalTree {

    public Node<Integer> root;
    private int[] a;

    public MinimalTree(int[] a){
        this.a = a;
        root = constructTree(0,a.length-1);
    }

    public Node<Integer> constructTree(int start, int end){
        if(start>end)
            return null;
        int mid = (end+start)/2;
        Node<Integer> current = new Node<>(a[mid]);
        current.left = constructTree(start,mid-1);
        current.right = constructTree(mid+1,end);
        return current;
    }
}
