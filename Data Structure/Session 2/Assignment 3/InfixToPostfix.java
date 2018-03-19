package com.metacube;

import java.util.Stack;

public class InfixToPostfix {
	static int Priority(char ch) {
		switch(ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		
		return -1;
	}
	
	public String convert(String input) {
		String result = new String("");
		Stack<Character> stack = new Stack<>();
		
		for(char c : input.toCharArray()) {
			if(Character.isLetterOrDigit(c)) {
				result += c;
			} else if(c == '(') {
				stack.push(c);
			} else if(c == ')') {
				while(!stack.isEmpty() && stack.peek() != '(') {
					result += stack.pop();
				}
				
				if(!stack.isEmpty() && stack.peek() != '(') {
					return "Invalid Expression";
				} else {
					stack.pop();
				}
			} else {
				while(!stack.isEmpty() && Priority(c) <= Priority(stack.peek())) {
					result += stack.pop();
				}
				
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty()) {
			result += stack.pop();
		}
		
		return result;
	}
}
