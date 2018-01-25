import static org.junit.Assert.*;

import org.junit.Test;


public class TestAssignment5 {

	Assignment5 assign = new Assignment5();
	
	@Test
	public void ascendingCase() {
		int arr[] = {1,3,5,6,7,9};
		int actual = assign.checkArray(arr);
		int expected = 1;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void descendingCase() {
		int arr[] = {9,5,4,3,1};
		int actual = assign.checkArray(arr);
		int expected = 2;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void unsortedCase() {
		int arr[] = {9,5,4,6,3,1};
		int actual = assign.checkArray(arr);
		int expected = 0;
		
		assertEquals(expected, actual);
	}

}
