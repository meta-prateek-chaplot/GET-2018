/**
 * 
 * @author Prateek
 * merge two sorted array
 */

public class Assignment6 {
	
	int[] join(int a[], int asize, int b[], int bsize, int c[]) {
		int indexA=0;	// checking how
		int indexB=0;	// many elements
		int indexC=0;	// have been compared.
		
		// put smaller-valued elements of the arrays of 'a' and 'b' in 'c'
		while( (indexC<(asize+bsize)) && (indexA<asize) && (indexB<bsize)) {
			if(a[indexA] <= b[indexB]) {
				c[indexC++] = a[indexA++];
			}
			else {
				c[indexC++] = b[indexB++];
			}
		}

		// checking whether array 'a' has been completely merged		
		while(indexA<asize) {
			c[indexC++] = a[indexA++];
		}
		
		// checking whether array 'b' has been completely merged
		while(indexB<bsize) {
			c[indexC++] = b[indexB++];
		}
		
		return c;
	}
}
