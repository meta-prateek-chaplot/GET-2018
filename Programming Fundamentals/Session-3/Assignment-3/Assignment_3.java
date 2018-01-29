/**
 * 
 * @author prateek
 * Session 3: Assignment 3
 *
 */
public class Assignment_3 {

	// placing the element at index 'high' at its appropriate location
	int partition(int arr[], int low, int high) {
		
		int pivot = arr[high];		// the element to place at its location
		int i = low-1;
		
		// find the appropriate location of the element at index 'high'
		for(int j=low; j<high; j++){
			if(arr[j]<=pivot) {
				i++;
				
				arr[j] = arr[i]+arr[j]-(arr[i]=arr[j]);		// one line swap
			}
		}
		
		// swapping element at index 'high' with its appropriate location
		arr[i+1] = arr[i+1]+arr[high]-(arr[high]=arr[i+1]);
		
		return i+1;
	}
	
	public int[] quickSort(int arr[], int low, int high) {
		
		if(low<high) {
			
			int idx = partition(arr, low, high);		// index of element which is places at its location
			
			quickSort(arr, low, idx-1);		// sort from 'start' to 'idx-1'
			quickSort(arr, idx+1, high);	// sort from 'start' to 'idx-1'
		}
		
		return arr;
	}
}
