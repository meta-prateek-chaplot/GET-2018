package com.metacube;

import static org.junit.Assert.*;

import org.junit.Test;

public class QueueTest {

	@Test
	public void testEnqueue() {
		Queue q = new Queue();
		
		q.enqueue("help");
		q.enqueue("nice");
		
		Object[] actuals = new Object[] {"help", "nice"};
		Object[] expecteds = q.getQueue();
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testDequeue() {
		Queue q = new Queue();
		
		q.enqueue("10");
		q.enqueue("5");
		
		q.dequeue();
		
		Object[] actuals = new Object[] {"5"};
		Object[] expecteds = q.getQueue();
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void makeEmpty() {
		Queue q = new Queue();
		
		q.enqueue(55);
		q.enqueue(10);
		
		q.makeEmpty();
		
		Object[] actuals = new Object[] {};
		Object[] expecteds = q.getQueue();
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testGetFront() {
		Queue q = new Queue();
		
		q.enqueue(46);
		q.enqueue(12);
		q.enqueue(33);
		
		Object expected = q.getFront();
		Object actual = 46;
		
		assertEquals(expected, actual);
	}
}
