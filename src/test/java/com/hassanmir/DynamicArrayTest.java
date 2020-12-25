package com.hassanmir;

import org.junit.Assert;
import org.junit.Test;

public class DynamicArrayTest {

    @Test
    public void testCapacity(){
        DynamicArray<Integer> arr = new DynamicArray<>(3);
        Assert.assertEquals(3,arr.capacity());
        arr.add(123);
        arr.add(123);
        arr.add(123);
        Assert.assertEquals(3,arr.capacity());
        arr.add(123);
        Assert.assertEquals(6,arr.capacity());
    }

    @Test
    public void testSize(){
        DynamicArray<String> arr = new DynamicArray<>(3);
        Assert.assertEquals(0,arr.size());
        arr.add("abc");
        arr.add("abc");
        arr.add("abc");
        Assert.assertEquals(3,arr.size());
        arr.add("abc");
        Assert.assertEquals(4,arr.size());
    }

    @Test
    public void testIsEmpty(){
        DynamicArray<Integer> arr = new DynamicArray<>(3);
        Assert.assertTrue(arr.isEmpty());
        arr.add(1);
        Assert.assertFalse(arr.isEmpty());
    }

    @Test
    public void testGet(){
        DynamicArray<String> arr = new DynamicArray<>(3);
        arr.add("abc");
        arr.add("def");
        arr.add("ghi");
        Assert.assertEquals(arr.get(1),"def");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsException1(){
        DynamicArray<String> arr = new DynamicArray<>();
        arr.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsException2(){
        DynamicArray<String> arr = new DynamicArray<>();
        arr.set(5,"abc");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetOutOfBoundsException3(){
        DynamicArray<String> arr = new DynamicArray<>();
        arr.add("abc");
        arr.get(-3);
    }

    @Test
    public void testSet(){
        DynamicArray<Integer> arr = new DynamicArray<>(3);
        arr.add(100);
        arr.add(101);
        arr.add(102);
        Assert.assertEquals(101, (int) arr.get(1));
        arr.set(1,201);
        Assert.assertEquals(201, (int) arr.get(1));
    }

    @Test
    public void testIndexOf(){
        DynamicArray<Integer> arr = new DynamicArray<>(3);
        arr.add(100);
        arr.add(101);
        arr.add(102);
        Assert.assertEquals(1, arr.indexOf(101));
        Assert.assertEquals(-1, arr.indexOf(103));
    }

    @Test
    public void testRemoveAt(){
        DynamicArray<Integer> arr = new DynamicArray<>(3);
        arr.add(100);
        arr.add(101);
        arr.add(102);
        Assert.assertEquals(101,(int)arr.get(1));
        arr.removeAt(1);
        Assert.assertEquals(102,(int)arr.get(1));
    }

    @Test
    public void testRemove(){
        DynamicArray<Integer> arr = new DynamicArray<>(3);
        arr.add(100);
        arr.add(101);
        arr.add(102);
        Assert.assertEquals(1,arr.indexOf(101));
        arr.remove(101);
        Assert.assertEquals(-1,arr.indexOf(101));
    }

    @Test
    public void testContains(){
        DynamicArray<Integer> arr = new DynamicArray<>(3);
        arr.add(100);
        arr.add(101);
        arr.add(102);
        Assert.assertTrue(arr.contains(101));
        arr.remove(101);
        Assert.assertFalse(arr.contains(101));
    }

    @Test
    public void testToString(){
        DynamicArray<Integer> arr = new DynamicArray<>(3);
        arr.add(100);
        arr.add(101);
        arr.add(102);
        Assert.assertEquals("[100,101,102]",arr.toString());

        DynamicArray<String> arrStr = new DynamicArray<>(3);
        arrStr.add("100");
        arrStr.add("101");
        arrStr.add("102");
        Assert.assertEquals("[100,101,102]",arrStr.toString());
    }
}
