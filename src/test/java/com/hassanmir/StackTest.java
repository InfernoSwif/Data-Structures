package com.hassanmir;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StackTest {

    private List<Stack<Integer>> stacks = new ArrayList<>();

    //support to test multiple stacks
    @Before
    public void setup() {
        stacks.add(new Stack<Integer>());
    }

    @Test
    public void testEmptyStack() {
        for (Stack stack : stacks) {
            Assert.assertTrue(stack.isEmpty());
            Assert.assertEquals(stack.size(),0);
        }
    }

    @Test(expected = Exception.class)
    public void testPopOnEmpty() {
        for (Stack stack : stacks) {
            stack.pop();
        }
    }

    @Test(expected = Exception.class)
    public void testPeekOnEmpty() {
        for (Stack stack : stacks) {
            stack.peek();
        }
    }

    @Test
    public void testPush() {
        for (Stack<Integer> stack : stacks) {
            stack.push(2);
            Assert.assertEquals(stack.size(),1);
        }
    }

    @Test
    public void testPeek() {
        for (Stack<Integer> stack : stacks) {
            stack.push(2);
            Assert.assertEquals((int)stack.peek(),2);
            Assert.assertEquals(stack.size(),1);
        }
    }

    @Test
    public void testPop() {
        for (Stack<Integer> stack : stacks) {
            stack.push(2);
            Assert.assertEquals((int)stack.pop(),2);
            Assert.assertEquals(stack.size(),0);
        }
    }

    @Test
    public void testExhaustively() {
        for (Stack<Integer> stack : stacks) {
            Assert.assertTrue(stack.isEmpty());
            stack.push(1);
            Assert.assertFalse(stack.isEmpty());
            stack.push(2);
            Assert.assertEquals(stack.size(),2);
            Assert.assertEquals((int)stack.peek(),2);
            Assert.assertEquals(stack.size(),2);
            Assert.assertEquals((int)stack.pop(),2);
            Assert.assertEquals(stack.size(),1);
            Assert.assertEquals((int)stack.peek(),1);
            Assert.assertEquals(stack.size(),1);
            Assert.assertEquals((int)stack.pop(),1);
            Assert.assertEquals(stack.size(),0);
            Assert.assertTrue(stack.isEmpty());
        }
    }
}
