/**
 * 
 * @author Prateek
 * Converts Binary Number to Octal Number
 *
 */
public class Assignment1 {

	public int binaryToOctal(int binary) {
		int decimal=0;	// used to store decimal equivalent of binary
		int octal=0;	// used to store octal equivalent of decimal
		int n=0;		// variable to express the power of 2
		
		// converting binary to decimal
		while(binary != 0) {
			decimal += (binary%10) * Math.pow(2, n);	// products the last digit of 'binary' and 2 raise to 'n'
			n++;
			binary /= 10;		// removes the last digit from the 'binary' variable 
		}
		
		// converting decimal to octal
		n=1;
		while(decimal != 0) {
			octal += (decimal%8)*n;		//  product of last digit octal equivalent of the 'decimal' and 2 raise to n 
			decimal /= 8; 
			n *= 10;
		}
		
		return octal;
	}
}
