/**
 * 
 * @author Prateek
 * finding if the array is increasing->1,
 * decreasing->2 or unsorted->0.
 */

public class Assignment5 {

	int checkArray(int input[]) {
		int flag=0;		// by default, assuming the array to be unsorted
		
		if(input[0] < input[input.length-1]) {		// comparing first & last elements for increasing/decreasing.
			// Ascending
			for(int counter=1; counter<input.length; counter++) {		// check whether the array is increasing
				flag=1;
				if(input[counter-1] > input[counter]) {
					flag=0;
					break;
				}
			}
		}
		else if(input[0] > input[input.length-1]) {		// check whether the array is decreasing
			// Descending
			for(int counter=1; counter<input.length; counter++) {
				flag=2;
				if(input[counter-1] < input[counter]) {
					flag=0;
					break;
				}
			}
		}
		
		return flag;
	}
}
