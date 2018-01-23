import java.util.*;

/**
 * 
 * @author Prateek
 * remove duplicate elements from an unsorted Array
 */

public class Assignment2 {
	
	public int[] removeDuplicate(int input[]) {
		ArrayList<Integer> al = new ArrayList<Integer>();	// used to store nonDuplicate values
		int length = input.length;
		
		for(int i=0; i<length; i++) {
			boolean flag=true;		// used to detect nonDuplicate values
			for(int j=0; j<al.size(); j++) {	// checks whether the element is duplicate or not
				if(input[i] == (int)al.get(j)) {
					flag=false;
					break;
				}
			}
			
			if(flag) {
				al.add(input[i]);
			}
		}
		
		// converting ArrayList to array for returning
		int[] res = new int[al.size()];
		for(int i=0; i<res.length; i++) {
			res[i] = al.get(i).intValue();
		}
		
		return res;
	}
}
