package com.hassanmir;

import com.hassanmir.Trees.BTreePrinter;
import com.hassanmir.Trees.MinimalTree;
import com.hassanmir.Trees.TreePrinter;
import org.junit.Test;

public class MinimalTreeTest {

    @Test
    public void testIntegerArray(){
        //int[] a = {1,3,6,7,9,12,15,16,18,20,25,30,38,45,100};

        int[] a = {0,1,2,3,4,5,6,7,8,9};
        MinimalTree tree = new MinimalTree(a);
        BTreePrinter.printNode(tree.root);
        TreePrinter.print(tree.root);
    }
}
