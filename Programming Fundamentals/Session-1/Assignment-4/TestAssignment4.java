import static org.junit.Assert.*;

import org.junit.Test;


public class TestAssignment4 {

	Assignment4 obj = new Assignment4();
	
	boolean isArrayEqual(int expected[][], int actual[][]) {
		if(expected.length != actual.length) {
//			System.out.println("Size Unequal!\nExpected length: " + expected.length + "Actual length: " + actual.length);
			return false;
		}
		
		for(int counter=0; counter<expected.length; counter++) {
			for(int colCounter=0; colCounter<4; colCounter++) {
				if(expected[counter][colCounter] != actual[counter][colCounter]) {
					
//					System.out.println("Value mismatch index: " + counter +"," + colCounter);
//					System.out.println("Expected value: "+ expected[counter][colCounter] + "Actual value: " + actual[counter][colCounter]);

					return false;
				}
			}
		}
		
		return true;
	}
	
	@Test
	public void test() {
		int arrival_time[] = {1,5,9,25};
		int job_size[] = {12,7,2,5};
		int actual[][] = obj.fcfs(arrival_time, job_size);
		
		int expected[][] = {{1,0,1,12},{5,8,13,19},{9,11,20,21},{25,0,25,29}};
		
		assertTrue(isArrayEqual(expected, actual));
	}

}
