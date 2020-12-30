package com.hassanmir.Trees;

public class Node<T extends Comparable<?>> implements TreePrinter.PrintableNode {
    public T value;
    public Node<T> left=null;
    public Node<T> right=null;

    public Node(){}

    public Node(T value){
        this.value=value;
    }

    @Override
    public TreePrinter.PrintableNode getLeft() {
        return left;
    }

    @Override
    public TreePrinter.PrintableNode getRight() {
        return right;
    }

    @Override
    public String getText() {
        return String.valueOf(value);
    }
}
