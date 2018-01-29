/**
 * 
 * @author prateek
 * Session 1: Assignment 1
 *
 */
public class Assignment_1 {
	
	public int rem(int x, int y) {
		
		if(y==0) {
			throw new IllegalArgumentException();
		}
		
		if(x>=y) {
			return rem(x-y, y);
		}
		
		return x;
	}
	
	public int gcd(int x, int y) {
		
		if(y>x){
			y = x+y-(x=y);		// one line swap			
		}

		if(x>=y && x%y == 0) {
			return y;
		}
		
		return gcd(y, x%y);
	}
	
	public int largestDigit(int x) {
		
		if(x==0)
			return 0;
		
		int unit = x%10;		// finding the value at unit's place
		int largest = largestDigit(x/10);		// finding the largest out of the remaining digits
		
		return (unit>largest)? unit: largest;
	}
}
