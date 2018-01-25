import java.util.Arrays;
/**
 * 
 * @author Prateek
 * find longest increasing sequence
 */
public class Assignment3 {
	int[] longestSequence(int[] input) {
		int maxCount=1;		// used to find length of largest sequence
		int idx=0;
		int length = input.length;
		
		for(int iterator=0, count=1; iterator<length-1; iterator++) {
			if(input[iterator] < input[iterator+1]) {		// if array is increasing, then increment 'count'
				count++;
			} else {	
				count=1;		// if not, then set 'count' to 1
			}
			
			if(count > maxCount) {		// setting max length of sequence to 'maxCount'
				maxCount = count;
				idx = iterator+1-maxCount;
			}
			
		}
		
		return Arrays.copyOfRange(input,idx+1,(idx+maxCount+1));
	}
}
