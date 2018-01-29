import static org.junit.Assert.*;

import org.junit.Test;


public class Assignment_3Test {

	Assignment_3 assign = new Assignment_3();
	
	@Test
	public void test1() {
		int arr[] = {2, 5, 8, 9, 10, 77, 55, 11};
		int actuals[] = assign.quickSort(arr, 0, arr.length-1);
		int expecteds[] = {2, 5, 8, 9, 10, 11, 55, 77};
		
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void test2() {
		int arr[] = {};
		int actuals[] = assign.quickSort(arr, 0, arr.length-1);
		int expecteds[] = {};
		
		assertArrayEquals(expecteds, actuals);
	}

}
