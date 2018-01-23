import static org.junit.Assert.*;

import org.junit.Test;


public class TestAssignment3 {

	Assignment3 obj = new Assignment3();
	
	@Test
	public void test() {
		int[] a = new int[] {1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int[] actuals = obj.longestSequence(a);
		int[] expecteds = new int[] {1,2,4,5,6,7,8,9};
		
		assertArrayEquals(expecteds, actuals);
	}

}

