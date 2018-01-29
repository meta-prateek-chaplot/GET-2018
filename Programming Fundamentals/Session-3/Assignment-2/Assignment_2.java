/**
 * 
 * @author Prateek
 * Session 3: Assignment 2
 * 
 */
public class Assignment_2 {
	
	public int linearSearch(int arr[], int l, int r, int x) {
		
		if(r<l) {
			return -1;
		}
		
		if(arr[l]==x) {
			return l;
		}
		
		// if element is not found at index 'l', then call the method again with index 'l+1'
		return linearSearch(arr, l+1, r, x);
	}
	
	public int binarySearch(int arr[], int l, int r, int x) {
		
		if(r>=l) {
			int mid = (l+r)/2;
			
			if(arr[mid]==x) {
				return mid;
			}
			
			if(arr[mid]>x) {
				return binarySearch(arr, l, mid-1, x);
			}
			
			return binarySearch(arr, mid+1, r, x);
		}
		
		return -1;
	}
	
}
