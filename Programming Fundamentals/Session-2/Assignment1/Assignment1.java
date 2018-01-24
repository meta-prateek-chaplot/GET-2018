
/**
 * 
 * @author Prateek
 * 
 * program to display pyramid of
 * size 'n' using modular approach
 * 
 */
public class Assignment1 {
	
	// method to return the string of
	// spaces for the particular row
	public String spaces(int row, int n) {
		String space = "";
		int spaceLength;
		
		// if-else to find the number of
		// spaces in the appropriate row
		if(row+1<n) {
			spaceLength = n - row-1;
		}
		else {
			spaceLength = row+1 - n;
		}
		
		for(int counter=0; counter<spaceLength; counter++) {
			space += " ";
		}
		
		return space;
	}
	
	// method to return the string of
	// numbers for the particular row
	public String numbers(int row, int n) {
		String number = "";
		
		int maxElement;		// to find the max element of the 'row'
		
		// if-else to find 'maxElement'
		if(row<n) {
			maxElement = row+1;
		}
		else {
			maxElement = n - row%n - 1;
		}
		
		int counter=0;	// appends the number to 'number' string
		
		// appending elements up to the increasing order up to max element
		while(counter<maxElement) {
			number += (++counter);
		}
		
		// appending elements up to the increasing order up to max element
		while(--counter != 0) {
			number += counter;
		}
		
		return number;
	}
	
	// method to print pyramid
	public String[] printPyramid(int n) {
		String pyramid[] = (n==0) ? new String[0] : new String[2*n-1];
		int row = n*2 - 1;		// number of rows in the pyramid
		
		Assignment1 assign = new Assignment1();
		
		for(int rowCounter=0; rowCounter<row; rowCounter++) {
			pyramid[rowCounter] = assign.spaces(rowCounter, n);		// adds spaces to 'pyramid['rowCounter']'
			pyramid[rowCounter] += assign.numbers(rowCounter, n);	// appends numbers in the particular row to 'pyramid['rowCounter']'
		}
		
		return pyramid;
	}
}
