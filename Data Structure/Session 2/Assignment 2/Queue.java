package com.metacube;

import java.util.Arrays;

public class Queue {
	private Object[] queue = new Object[0];
	
	public void enqueue(Object obj) {
		queue = Arrays.copyOf(queue, queue.length+1);
		
		queue[queue.length-1] = obj;
	}
	
	public void dequeue() {
		if(queue.length == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		queue = Arrays.copyOfRange(queue, 1, queue.length);
	}
	
	public void makeEmpty() {
		queue = new Object[0];
	}
	
	public Object getFront() {
		if(queue.length == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		return queue[0];
	}
	
	public Object[] getQueue() {
		return queue;
	}
}
