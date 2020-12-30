package com.hassanmir.Trees;

public class CheckBST<T extends Comparable<T>> {
    //Check if a Binary Tree is a Binary Search Tree
    public static boolean isBST(Node<Integer> n){
        return isBST(n,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    public static boolean isBST(Node<Integer> n, int min, int max){
        if(n==null)
            return true;

        if(n.value.compareTo(min)>0
            && n.value.compareTo(max)<=0){
            return isBST(n.left,min,n.value) && isBST(n.right,n.value,max);
        }
        return false;
    }
}
