import java.io.*;
import java.util.*;

/**
 * 
 * @author Prateek
 *
 */
public class Result {
	static int participantCount=0;		// used to store the participant count
	static String result = "";		// used to store the result of Report A
	static int ans[];		// used to store the answers of 'single' type of all the participants
	
	/**
	 * default constructor used for obtaining result
	 */
	Result() {}
	
	/**
	 * parameterized constructor which calls setReportA and setReportB function
	 * @param r : used to obtain question Type from questions asked 
	 * @param participant : used to get answers of the participant
	 */
	Result(Read r, Map<String, String> participant) {
		
		++participantCount;
		
		// provide report A
		setReportA(r, participant);
		
		// generate file for report B
		setReportB(participant);
	}
	
	/**
	 * used to generate the report A and store it in result class variable
	 * @param r : used to get questions asked from the participant
	 * @param participant : used to participant answers
	 */
	void setReportA(Read r, Map<String, String> participant) {
		List<Question> ques = r.getQuesList();
		result = "Overall Rating, Single Select, ";
		
		int listSize = 0;
		for(Question q : ques) {
			if(q.quesType.contains("single")) {
				List<String> type = q.quesOption;
				listSize = type.size();
				int temp = listSize;
				
				for(String s : type) {
					result += s;
					
					if(--temp != 0) {
						result += "/";
					}
				}
				result += "\n";
			}
		}
		
		if(participantCount == 1) {
			ans = new int[listSize];
		}
		
		Object option = participant.get("single");
		String tmp = (String) option;
		int selectedOption = Integer.parseInt(tmp);
		
		ans[selectedOption-1]++;
		
		for(int ansIndex=0; ansIndex<ans.length; ansIndex++) {
			result += (ansIndex+1) + " - " + (ans[ansIndex] * 100 / participantCount) + "%\n";
		}
	}
	
	/**
	 * function used to generate the report B and save it on to the file
	 * @param participant : passed for obtaining participant answers
	 */
	void setReportB(Map<String, String> participant) {
		try(FileWriter fw = new FileWriter("C:\\Users\\admin\\workspace\\Prateek\\src\\Report-B.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter file = new PrintWriter(bw)) {
			
			file.print("Participant " + participantCount);
			
			Set<Map.Entry<String, String>> value = participant.entrySet();
			for(Map.Entry<String, String> singleVal : value) {
				file.print(", " + singleVal.getValue());
			}
			
			file.println(".");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * getter function used to return result generated
	 * @return String result
	 */
	String getResult() {
		return result;
	}
}
