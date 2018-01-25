import static org.junit.Assert.*;

import org.junit.Test;


public class TestAssignment6 {

	Assignment6 assign = new Assignment6();
	
	@Test
	public void test() {
		int a[] = {4,9,11,23,33};
		int b[] = {1,6,22,28,30,32,39};
		int c[] = new int[a.length + b.length];
		
		int actuals[] = assign.join(a, 5, b, 7, c);
		int expecteds[] = {1,4,6,9,11,22,23,28,30,32,33,39};
		
		assertArrayEquals(expecteds, actuals);
	}

}
