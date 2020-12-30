package com.hassanmir.Trees;

public class CheckBalanced {

    //Check if a binary tree is balanced
    public static boolean checkBalanced(Node<Integer> n){
        return checkHeight(n,0)!=Integer.MIN_VALUE;
    }

    //returns height of tree if balanced, else min_value
    public static int checkHeight(Node<Integer> n, int height){
        if(n==null) return -1;

        int leftH = checkHeight(n.left,height+1);
        int rightH = checkHeight(n.right, height+1);
        if(leftH==Integer.MIN_VALUE || rightH==Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(Math.abs(leftH-rightH)>1) return Integer.MIN_VALUE;

        return Math.max(leftH,rightH)+1;
    }
}
