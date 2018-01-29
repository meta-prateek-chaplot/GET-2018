import static org.junit.Assert.*;

import org.junit.Test;


public class Assignment4Test {

	Assignment4 obj = new Assignment4();
	
	boolean isArrayEqual(int expected[][], int actual[][]) {
		if(expected.length != actual.length) {
			return false;
		}
		
		for(int counter=0; counter<expected.length; counter++) {
			for(int colCounter=0; colCounter<4; colCounter++) {
				if(expected[counter][colCounter] != actual[counter][colCounter]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	@Test
	public void givenTest() {
		int arrival_time[] = {1,5,9,25};
		int job_size[] = {12,7,2,5};
		int actual[][] = obj.fcfs(arrival_time, job_size);
		
		int expected[][] = {{1,0,1,12},{5,8,13,19},{9,11,20,21},{25,0,25,29}};
		
		assertTrue(isArrayEqual(expected, actual));
	}
}
