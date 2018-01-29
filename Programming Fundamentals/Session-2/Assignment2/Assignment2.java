/**
 * 
 * @author Prateek
 * 
 * print upper triangle pattern
 * 
 */
public class Assignment2 {
	
	// method to return the string of
	// spaces for the particular row
	public String spaces(int row, int n) {
		String space = "";
		
		// append " " to 'space'
		for(int counter=n-row; counter<n; counter++) {
			space += " ";
		}
		
		return space;
	}
	
	// method to return the string of
	// numbers for the particular row
	public String number(int row, int n) {
		String number = "";
		
		// append numbers to 'number'
		for(int counter=1; counter<=n-row; counter++) {
			number += counter;
		}
		
		return number;
	}
	
	// method to print pattern
	public String[] printPattern(int n) {
		String[] pattern = new String[n] ;
		
		Assignment2 assign = new Assignment2();
		
		// set complete row to 'patter['rowCounter']'
		for(int rowCounter=0; rowCounter<n; rowCounter++) {
			pattern[rowCounter] = assign.spaces(rowCounter,n);
			pattern[rowCounter] += assign.number(rowCounter,n);
		}
		
		return pattern;
	}
}
