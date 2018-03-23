package com.metacube;

import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author Prateek Chaplot
 *
 */
public class Stack {
	private List<Object> obj = new LinkedList<Object>();	// stack implemented using list
	
	/**
	 * push functionality
	 * @param obj
	 */
	public void push(Object obj) {
		this.obj.add(obj);
	}
	
	/**
	 * pop functionality
	 */
	public void pop() {
		if(obj.size() == 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		
		obj.remove(obj.size()-1);
	}
	
	/**
	 * for testing purpose
	 * @return stack of objects
	 */
	public Object[] getList() {
		return obj.toArray();
	}
}
