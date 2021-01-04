package com.hassanmir;

import com.hassanmir.Trees.BinarySearchTree;
import com.hassanmir.Trees.TreePrinter;
import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

    @Test
    public void testBinarySearchTree(){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        Assert.assertTrue(tree.isEmpty());

        tree.insert(10);
        tree.insert(5);
        tree.insert(15);
        tree.insert(2);
        tree.insert(7);
        tree.insert(12);
        tree.insert(17);
        tree.insert(6);
        tree.insert(8);
        Assert.assertEquals(9,tree.getSize());

        TreePrinter.print(tree.getRandomNode());
        TreePrinter.print(tree.getRandomNode());
        TreePrinter.print(tree.getRandomNode());
        TreePrinter.print(tree.getRandomNode());

        TreePrinter.print(tree.root);

        tree.delete(5);
        Assert.assertEquals(8,tree.getSize());

        TreePrinter.print(tree.root);

        tree.delete(17);
        Assert.assertEquals(7,tree.getSize());
        TreePrinter.print(tree.root);

    }
}
