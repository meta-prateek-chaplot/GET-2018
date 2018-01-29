import static org.junit.Assert.*;

import org.junit.Test;


public class Assignment3Test {

	Assignment3 obj = new Assignment3();
	
	@Test
	public void normalTest() {
		int[] a = new int[] {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int[] actuals = obj.longestSequence(a);
		int[] expecteds = new int[] {1,2,4,5,6,7,8,9};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void simpleTest() {
		int[] a = new int[] {1,1,1,5,4,2,9,7,5,3,6,4,1,5,8,9,5,2,2,5,4,1,8,9,6,3,4,7,8,4};
		int[] actuals = obj.longestSequence(a);
		int[] expecteds = new int[] {1,5,8,9};
		
		assertArrayEquals(expecteds, actuals);
	}
}
