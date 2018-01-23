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
		
		for(int i=1, count=1; i<length; i++) {
			if(input[i-1] < input[i]) {		// if array is increasing, then increment 'count'
				count++;
			} else {	
				count=1;		// if not, then set 'count' to 1
			}
			
			if(count > maxCount) {		// setting max length of sequence to 'maxCount'
				maxCount = count;
				idx = i-maxCount;
			}
			
		}
		
		return Arrays.copyOfRange(input,idx+1,(idx+maxCount+1));
	}
}
