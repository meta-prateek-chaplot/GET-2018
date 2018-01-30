import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class Assignment_2Test {

	Assignment_2 assign = new Assignment_2();
	
	@Test
	public void test_3() {
		List<String> res = assign.permutation("ABC");
		Object[] actuals = res.toArray();
		String[] expecteds = {"ABC", "ACB", "BAC", "BCA", "CAB", "CBA"};
		
		assertArrayEquals(expecteds, actuals);
	}
	
}
