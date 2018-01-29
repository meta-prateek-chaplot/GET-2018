import java.util.*;

/**
 * 
 * @author Prateek
 * remove duplicate elements from an unsorted Array
 */

public class Assignment2 {
	
	/*	
	 * Solutions possible:
	 * 1. create a dynamic array and copy all the non duplicates
	 * 2. mark obsolete entries at duplicates and then copy nonDuplicates in another array
	 * 3. delete the duplicates by repetetiveCopy and then return the array with modified length
	 * 
	 * Method adopted: (3)
	 * 
	 */	
	
	public int[] removeDuplicate(int input[]) {
		int length = input.length;
		
		for(int counter=0; counter<length-1; counter++) {
			for(int checkIndex=counter+1; checkIndex<length; checkIndex++) {
				
				if(input[checkIndex] == input[counter]) {
					// delete the element
					for(int index=checkIndex; index<length-1; index++) {
						input[index] = input[index+1];
					}
					
					// decrement the length
					length--;
					
					// decrement checkIndex
					checkIndex--;
				}
			}
		}
		
		return Arrays.copyOfRange(input, 0, length);
	}
}
