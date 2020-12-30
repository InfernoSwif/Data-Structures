package com.hassanmir;

import com.hassanmir.Trees.CheckBST;
import com.hassanmir.Trees.Node;
import com.hassanmir.Trees.TreePrinter;
import org.junit.Assert;
import org.junit.Test;

public class CheckBSTTest {

    @Test
    public void testIsBST(){
        //set up perfect tree
        Node<Integer> n0 = new Node<>(10);

        Node<Integer> n1 = new Node<>(5);
        Node<Integer> n2 = new Node<>(15);

        Node<Integer> n3 = new Node<>(2);
        Node<Integer> n4 = new Node<>(8);
        Node<Integer> n5 = new Node<>(12);
        Node<Integer> n6 = new Node<>(18);

        Node<Integer> n7 = new Node<>(1);
        Node<Integer> n8 = new Node<>(3);
        Node<Integer> n9 = new Node<>(6);
        Node<Integer> n10 = new Node<>(9);
        Node<Integer> n11 = new Node<>(11);
        Node<Integer> n12 = new Node<>(13);
        Node<Integer> n13 = new Node<>(17);
        Node<Integer> n14 = new Node<>(19);

        n0.left=n1;
        n0.right=n2;

        n1.left=n3;
        n1.right=n4;
        n2.left=n5;
        n2.right=n6;

        n3.left=n7;
        n3.right=n8;
        n4.left=n9;
        n4.right=n10;
        n5.left=n11;
        n5.right=n12;
        n6.left=n13;
        n6.right=n14;

        TreePrinter.print(n0);
        Assert.assertTrue(CheckBST.isBST(n0));

        n14.value = 1;
        TreePrinter.print(n0);
        Assert.assertFalse(CheckBST.isBST(n0));

        n14.value = 19;
        n10.value = 11;
        TreePrinter.print(n0);
        Assert.assertFalse(CheckBST.isBST(n0));
    }
}
