package com.hassanmir;

import org.junit.Assert;
import org.junit.Test;

public class DynamicArrayTest {

    @Test
    public void DynamicArrayTest(){
        DynamicArray<Integer> arr = new DynamicArray<>(5);
        Assert.assertTrue(arr.capacity==5);
        Assert.assertTrue(true);
    }
}
