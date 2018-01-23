import static org.junit.Assert.*;

import org.junit.Test;


public class TestAssignment1 {

	Assignment1 assign = new Assignment1();		// object 'assign' to test 'binaryToOctal' method
	
	@Test
	public void normalTest() {
		int actual = assign.binaryToOctal(100101);
		int expected = 45;
		
		assertEquals(expected, actual);
	}
	
	/*
	This testCase will fail as starting with
	zero results in interpreting the given
	number as octal number.
	*/
	@Test
	public void startWithZero() {
		int actual = assign.binaryToOctal(011010);
		int expected = 32;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void zeroTest() {
		int actual = assign.binaryToOctal(000000);
		int expected = 0;
		
		assertEquals(expected, actual);
	}

}
