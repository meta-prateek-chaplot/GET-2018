import java.util.ArrayList;
import java.util.List;

public class Assignment_1 {
	List<String> res = new ArrayList<String>();
	/**
	 * recursive function to solve tower of hanoi
	 * @param source
	 * @param destination
	 * @param temp
	 * @param numOfDisk
	 * @return
	 */
	List<String> towerOfHanoi(String source, String destination, String temp, int numOfDisk) {
		if(numOfDisk == 1) {
			res.add("Move disk 1 from rod " + source + " to rod " + destination);
			return res;
		}
		
		towerOfHanoi(source, temp, destination, numOfDisk-1);
		res.add("Move disk " + numOfDisk + " from rod " + source + " to rod "  + destination);
		towerOfHanoi(temp, destination, source, numOfDisk-1);
		return res;
	}

}
