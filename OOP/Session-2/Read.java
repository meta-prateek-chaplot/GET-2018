import java.io.*;
import java.util.*;

/**
 * 
 * @author Prateek
 *
 */
public class Read {
	List<Question> quesList = new ArrayList<>();	// stores the list of the questions to be asked
	
	/**
	 * used to read the file for getting questions
	 * @param filePath
	 * @throws IOException
	 */
	Read(String filePath) throws IOException {
		try {	
			File f = new File(filePath);
			Scanner sc = new Scanner(f);
			
			while(sc.hasNext()) {
				Question q = new Question(sc.nextLine());
				quesList.add(q);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * getter function to return the quesList
	 * @return question list
	 */
	List<Question> getQuesList() {
		return quesList;
	}
}
