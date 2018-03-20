package com.metacube;

import static org.junit.Assert.*;

import org.junit.Test;

public class InfixToPostfixTest {

	@Test
	public void testConvert() {
		InfixToPostfix obj = new InfixToPostfix();
		
		String input = "a+b*(c^d-e)^(f+g*h)-i";
		
		String expected = "abcd^e-fgh*+^*+i-";
		String actual = obj.convert(input);
		
		assertEquals(expected, actual);
	}

	@Test(expected = ArithmeticException.class)
	public void testConvert2() {
		InfixToPostfix obj = new InfixToPostfix();
		
		String input = "a+b)*(c^d-e)^(f+g*h)-i";
		
		String expected = "abcd^e-fgh*+^*+i-";
		String actual = obj.convert(input);
		
		assertEquals(expected, actual);
	}
}
