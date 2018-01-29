import static org.junit.Assert.*;

import org.junit.Test;


public class Assignment_1Test {

	Assignment_1 assign = new Assignment_1();
	
	@Test
	public void remTest1() {
		int actual = assign.rem(2, 1);
		int expected = 0;
		
		assertEquals(expected, actual);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void remTest2() {
		int actual = assign.rem(2, 0);
		int expected=0;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void remTest3() {
		int actual = assign.rem(100, 3);
		int expected = 1;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void gcdTest1() {
		int actual = assign.gcd(2, 1);
		int expected = 1;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void gcdTest2() {
		int actual = assign.gcd(12, 18);
		int expected = 6;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void gcdTest3() {
		int actual = assign.gcd(100, 3);
		int expected = 1;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void largestDigitTest1() {
		int actual = assign.largestDigit(2);
		int expected = 2;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void largestDigitTest2() {
		int actual = assign.largestDigit(1257369);
		int expected = 9;
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void largestDigitTest3() {
		int actual = assign.largestDigit(444);
		int expected = 4;
		
		assertEquals(expected, actual);
	}
	
}
