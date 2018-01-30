import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class Assignment_1Test {

	Assignment_1 assign = new Assignment_1();
	
	@Test
	public void threeTest() {
		List<String> result = assign.towerOfHanoi("A", "C", "B", 3);
		String[] actuals = result.toArray(new String[0]);
		String[] expecteds = {"Move disk 1 from rod A to rod C", "Move disk 2 from rod A to rod B", 
				"Move disk 1 from rod C to rod B", "Move disk 3 from rod A to rod C", "Move disk 1 from rod B to rod A",
				"Move disk 2 from rod B to rod C", "Move disk 1 from rod A to rod C"};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void twoTest() {
		List<String> result = assign.towerOfHanoi("A", "C", "B", 2);
		String[] actuals = result.toArray(new String[0]);
		String[] expecteds = {"Move disk 1 from rod A to rod B", "Move disk 2 from rod A to rod C",
				"Move disk 1 from rod B to rod C"};
		
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void oneTest() {
		List<String> result = assign.towerOfHanoi("A", "C", "B", 1);
		String[] actuals = result.toArray(new String[0]);
		String[] expecteds = {"Move disk 1 from rod A to rod C"};
		
		assertArrayEquals(expecteds, actuals);
	}


}
