import static org.junit.Assert.*;

import org.junit.Test;


public class Assignment_2Test {

	Assignment_2 assign = new Assignment_2();
	
	@Test
	public void linearTest1() {
		int arr[] = {2, 5, 8, 9, 10, 77, 55};
		int actual = assign.linearSearch(arr, 0, arr.length-1, 88);
		int expected = -1;
		
		assertEquals(expected, actual);
	}
	@Test
	public void linearTest2() {
		int arr[] = {2, 5, 8, 9, 10, 77, 55, 11};
		int actual = assign.linearSearch(arr, 0, arr.length-1, 77);
		int expected = 5;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void binaryTest1() {
		int arr[] = {2, 5, 8, 9, 10, 77, 55};
		int actual = assign.binarySearch(arr, 0, arr.length-1, 88);
		int expected = -1;
		
		assertEquals(expected, actual);
	}
	@Test
	public void binaryTest2() {
		int arr[] = {2, 5, 8, 9, 10, 77, 55};
		int actual = assign.binarySearch(arr, 0, arr.length-1, 77);
		int expected = 5;
		
		assertEquals(expected, actual);
	}

}
