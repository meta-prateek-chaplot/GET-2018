import static org.junit.Assert.*;

import org.junit.Test;


public class TestAssignment2 {

	Assignment2 obj = new Assignment2();
	
	@Test
	public void normalTest() {
		int a[] = new int[] {2,5,4,6,3,8,5,9,3,3,6,3,9,0};
		int[] actual = obj.removeDuplicate(a);
		int[] expected = new int[] {2,5,4,6,3,8,9,0};
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void ordinaryCase() {
		int a[] = new int[] {2,4,6,5,4,7,8,5,6,9,4,0,0,0};
		int[] actual = obj.removeDuplicate(a);
		int[] expected = new int[] {2,4,6,5,7,8,9,0};
		
		assertArrayEquals(expected, actual);
	}

}
