import static org.junit.Assert.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;


public class SurveyTest {
	static Read file;
	
	@BeforeClass
	public static void onlyOnce() throws IOException {
		file = new Read("C:\\Users\\admin\\workspace\\Prateek\\src\\question.txt");
	}
	
	@Test
	public void test() throws UnsupportedEncodingException, IOException {
		Participant p1 = new Participant(file, new String[]{"1", "Speed/Content", "Nice"});
		Participant p2 = new Participant(file, new String[]{"4", "Speed/Content/Quality", "Bad"});
		
		Result result = new Result();
		String actual = result.getResult();
		String expected = "Overall Rating, Single Select, 1/2/3/4/5\n" + 
						  "1 - 50%\n" +  "2 - 0%\n" +  "3 - 0%\n" +  "4 - 50%\n" +  "5 - 0%\n";
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testSucess() throws UnsupportedEncodingException, IOException {
		Participant p1 = new Participant(file, new String[]{"2", "Speed/Content", "Nice"});
		Participant p2 = new Participant(file, new String[]{"5", "Speed/Content", "Nice"});
		Participant p3 = new Participant(file, new String[]{"2", "Speed/Content/Quality", "Bad"});
		Participant p4 = new Participant(file, new String[]{"4", "Speed/Content", "Nice"});
		
		Result result = new Result();
		String actual = result.getResult();
		String expected = "Overall Rating, Single Select, 1/2/3/4/5\n" + 
						  "1 - 16%\n" +  "2 - 33%\n" +  "3 - 0%\n" +  "4 - 33%\n" +  "5 - 16%\n";
		
		assertEquals(actual, expected);
	}
}
