package com.hassanmir;

import org.junit.Assert;
import org.junit.Test;

public class QueueTest {

    @Test
    public void testQueueFull(){
        Queue<Integer> q = new Queue<>();
        Assert.assertTrue(q.isEmpty());
        q.offer(5);
        q.offer(6);
        q.offer(7);
        Assert.assertEquals(5,(int)q.poll());
        Assert.assertEquals(6,(int)q.poll());
        Assert.assertFalse(q.isEmpty());
        Assert.assertEquals(7,(int)q.peek());
        Assert.assertFalse(q.isEmpty());
        q.offer(8);
        Assert.assertEquals(7,(int)q.poll());
    }

    @Test
    public void testQueueWithTwoStacksFull(){
        QueueWithTwoStacks<Integer> q = new QueueWithTwoStacks<>();
        Assert.assertTrue(q.isEmpty());
        q.offer(5);
        q.offer(6);
        q.offer(7);
        Assert.assertEquals(5,(int)q.poll());
        Assert.assertEquals(6,(int)q.poll());
        Assert.assertFalse(q.isEmpty());
        Assert.assertEquals(7,(int)q.peek());
        Assert.assertFalse(q.isEmpty());
        q.offer(8);
        Assert.assertEquals(7,(int)q.poll());
    }
}
