import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * 
 * @author Prateek
 *
 */
public class Participant {
	Map<String, String> participant;	// Map<quesType, answer> to store participant answers
	
	/**
	 * constructor to fill values in participant Map
	 * @param r : object of class 'Read', used to hold question to be answered
	 * @param ans : string array, used to hold answers of participant
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 */
	Participant(Read r, String[] ans) throws UnsupportedEncodingException, IOException {
		List<Question> ques = r.getQuesList();
		
		participant = new HashMap<>();
		
		int ansIndex=0;
		for(Question q : ques) {
			participant.put(q.quesType, ans[ansIndex++]);
		}
		
		Result res = new Result(r, participant);
	}
}
