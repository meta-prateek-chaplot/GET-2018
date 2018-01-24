import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment1Test {

	Assignment1 assign = new Assignment1();
	
	@Test
	public void normalTest() {
		String actual[] = assign.printPyramid(5);
		String expected[] = {"    1","   121","  12321"," 1234321","123454321"," 1234321","  12321","   121","    1"};
		
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void simpleTest() {
		String actual[] = assign.printPyramid(2);
		String expected[] = {" 1","121"," 1"};
		
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void easyTest() {
		String actual[] = assign.printPyramid(8);
		String expected[] = {"       1","      121","     12321","    1234321","   123454321","  12345654321"," 1234567654321","123456787654321"," 1234567654321","  12345654321","   123454321","    1234321","     12321","      121","       1"};
		
		assertArrayEquals(actual, expected);
	}
	
	@Test
	public void emptryArrayTest() {
		String actual[] = assign.printPyramid(0);
		String expected[] = {};
		
		assertArrayEquals(actual, expected);
	}
	
}