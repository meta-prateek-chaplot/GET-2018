import java.util.ArrayList;
import java.util.List;

public class Assignment_2 {
	static List<String> res = new ArrayList<String>();
	/**
	 * function which is responsible for initializing helper function
	 * @param s
	 * @return
	 */
	List<String> permutation(String s) {
		
		Assignment_2 assign = new Assignment_2();
		assign.permutationHelper(s, "");
		
		return res;
	}
	/**
	 * recursive function used to find every possible permutation
	 * @param s
	 * @param chosen
	 */
	void permutationHelper(String s, String chosen) {
		if(s.isEmpty()) {
			res.add(chosen);
		}
		else {
			for(int i=0; i<s.length(); i++) {
				permutationHelper((s.substring(0, i) + s.substring(i+1)), (chosen + s.charAt(i)));
			}
		}
	}
}
