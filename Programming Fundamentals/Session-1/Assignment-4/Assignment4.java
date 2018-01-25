/**
 * 
 * @author Prateek
 * implementation of first come first serve scheduling
 */

public class Assignment4 {
	
	int[][] fcfs(int arrival_time[], int job_size[]) {
		int result[][] = new int[arrival_time.length][4];	// resultant array which will be returned
		int rowLength = arrival_time.length;		// no. of jobs or length of the row of 'result' array
		
		int arrivalTime = 0;
		int waitTime = 1;
		int startTime = 2;
		int finishTime = 3;
		
		for(int counter=0; counter<rowLength; counter++) {
			// set arrival time
			result[counter][arrivalTime] = arrival_time[counter];
			
			// set wait time
			if(counter==0){
				result[0][waitTime] = 0;
			}
			else{
				if(result[counter][arrivalTime] <= result[counter-1][finishTime]) {
					result[counter][waitTime] = result[counter-1][finishTime] - result[counter][arrivalTime] + 1;
				}
				else {
					result[counter][waitTime] = 0;
				}
			}
			
			// set start time
			if(counter==0){
				result[0][startTime] = result[0][arrivalTime];
			}
			else{
				if((result[counter-1][finishTime]+1) > result[counter][arrivalTime]) {
					result[counter][startTime] = result[counter-1][finishTime]+1;
				}
				else {
					result[counter][startTime] = result[counter][arrivalTime];
				}
			}
			
			// set finish time
			result[counter][finishTime] = result[counter][startTime] + job_size[counter] - 1;
		}
		
		return result;
	}
}
