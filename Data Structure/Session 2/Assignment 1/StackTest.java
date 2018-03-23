package com.metacube;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * 
 * @author Prateek Chaplot
 *
 */
public class StackTest {

	@Test
	public void testPush() {
		Stack s = new Stack();
		s.push("5");
		s.push("hello");
		
		Object[] actuals = s.getList();
		Object[] expecteds = new Object[] {"5", "hello"};
		
		assertArrayEquals(expecteds, actuals);
	}

	
	@Test
	public void testPop() {
		Stack s = new Stack();
		s.push(99);
		s.push("yo");
		s.pop();
		
		Object[] actuals = s.getList();
		Object[] expecteds = new Object[] {99};
		
		assertArrayEquals(expecteds, actuals);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testException() {
		Stack s = new Stack();
		s.push(99);
		s.push("yo");
		s.pop();
		s.pop();
		s.pop();
		
		Object[] actuals = s.getList();
		Object[] expecteds = new Object[] {99};
		
		assertArrayEquals(expecteds, actuals);
	}
}
