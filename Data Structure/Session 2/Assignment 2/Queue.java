package com.metacube;

public class Queue {
	private Object[] queue = new Object[5];
	private int size=0;
	
	public void enqueue(Object obj) {
		queue[size++] = obj;
	}
	
	public void dequeue() {
		for(int i=0; i<size; i++) {
			queue[i] = queue[i+1];
		}
		
		size--;
	}
	
	public void makeEmpty() {
		queue = new Object[5];
		size=0;
	}
	
	public Object getFront() {
		return queue[size-1];
	}
	
	public int getSize() {
		return size;
	}
	
	public Object[] getQueue() {
		return queue;
	}
}
