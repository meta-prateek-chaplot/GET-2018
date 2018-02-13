import java.util.*;

/**
 * 
 * @author Prateek
 *
 */
public class Question {
	String ques;		// stores the question
	String quesType;		// stores the type of the question
	List<String> quesOption;		// stores the options available for 'single' type questions
	
	/**
	 * constructor used to convert string to question and find its type
	 * @param line
	 */
	Question(String line) {
		Scanner sc = new Scanner(line).useDelimiter(",");

		ques = sc.next();
		quesType = sc.next();
		String quesOptionString = null;
		
		if(sc.hasNext()) {
			quesOptionString = sc.next();
		}
		
		questionOption(quesOptionString);
	}
	
	/**
	 * used to obtain all the options available for 'single' type questions
	 * @param optionList
	 */
	void questionOption(String optionList) {
		if(optionList != null) {
			Scanner sc = new Scanner(optionList).useDelimiter("/");
			quesOption = new ArrayList<>();
			
			while(sc.hasNext()) {
				quesOption.add(sc.next());
			}
		} else {
			quesOption = null;
		}		
	}
}
