import static org.junit.Assert.*;

import org.junit.Test;

public class Assignment2Test {

	Assignment2 assign = new Assignment2();
	
	@Test
	public void normalTest() {
		String actual[] = assign.printPattern(5);
		String expected[] = {"12345"," 1234","  123","   12","    1"};
		assertArrayEquals(expected, actual);
	}
	
	@Test
	public void emptyArrayTest() {
		String actual[] = assign.printPattern(0);
		String expected[] = {};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void smallValueTest() {
		String actual[] = assign.printPattern(2);
		String expected[] = {"12"," 1"};
		assertArrayEquals(expected, actual);
	}

}
