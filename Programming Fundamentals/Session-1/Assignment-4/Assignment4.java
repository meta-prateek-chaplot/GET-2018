/**
 * 
 * @author Prateek
 * implementation of fcfs
 */
public class Assignment4 {
	
	int[][] fcfs(int arrival_time[], int job_size[]) {
		int result[][] = new int[arrival_time.length][4];	// resultant array which will be returned
		int rowLength = arrival_time.length;		// no. of jobs or length of the row of 'result' array
		
		// result[-][0] -> arrivalTime, result[-][1] -> waitTime,
		// result[-][2] -> startTime, result[-][3] -> finishedTime.
		
		for(int counter=0; counter<rowLength; counter++) {
			// set arrival time
			result[counter][0] = arrival_time[counter];
			
			// set wait time
			if(counter==0){
				result[0][1] = 0;
			}
			else{
				if(result[counter][0] <= result[counter-1][3]) {
					result[counter][1] = result[counter-1][3] - result[counter][0] + 1;
				}
				else {
					result[counter][1] = 0;
				}
			}
			
			// set start time
			if(counter==0){
				result[0][2] = result[0][0];
			}
			else{
				if((result[counter-1][3]+1) > result[counter][0]) {
					result[counter][2] = result[counter-1][3]+1;
				}
				else {
					result[counter][2] = result[counter][0];
				}
			}
			
			// set finish time
			result[counter][3] = result[counter][2] + job_size[counter] - 1;
		}
		
		return result;
	}
}
