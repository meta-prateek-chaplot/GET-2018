import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class WorkflowTest {

	Workflow work = new Workflow("Metacube Hiring Process");
	
	@Before
	public void beginWorkFlow() {
		State startState = new State("Start");
		work.addState(startState);
		
		State hrReviewState = new State("HR_Review");
		work.addState(hrReviewState);
		
		State l1InterviewState = new State("L1_Interview");
		work.addState(l1InterviewState);
		
		State l2InterviewState = new State("L2_Interview");
		work.addState(l2InterviewState);
		
		State mngmtInterviewState = new State("Management_Interview");
		work.addState(mngmtInterviewState);
		
		State offerState = new State("Offer");
		work.addState(offerState);
		
		work.setStartState();
	}
	
	@Test
	public void testSelection() {
		Event event1 = new Event("HR_Process");
		work.transitionStep(event1);
		
		Event event2 = new Event("HR_Ok");
		work.transitionStep(event2);
		
		Event event3 = new Event("L1_Ok");
		work.transitionStep(event3);
		
		Event event4 = new Event("L2_Ok");
		work.transitionStep(event4);

		Event event5 = new Event("Management_Ok");
		work.transitionStep(event5);
		
		List<Transition> actualObject = work.getTransitionList();
		List<String> actual = new ArrayList<String>();
		
		actual.add("Selected");
		for(Transition t: actualObject) {
			actual.add(t.initialState.stateName + " " + t.event.eventName + " " + t.finalState.stateName);
		}
		
		List<String> expected = new ArrayList<String>();
		expected.addAll(Arrays.asList("Selected",
				"Start HR_Process HR_Review", "HR_Review HR_Ok L1_Interview", "L1_Interview L1_Ok L2_Interview",
				"L2_Interview L2_Ok Management_Interview", "Management_Interview Management_Ok Offer"));
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRejection() {
		Event event1 = new Event("HR_Process");
		work.transitionStep(event1);
		
		Event event2 = new Event("HR_Ok");
		work.transitionStep(event2);
		
		Event event3 = new Event("L2_Ok");
		work.transitionStep(event3);
		
		Event event4 = new Event("Management_Ok");
		work.transitionStep(event4);
		
		List<String> actual = new ArrayList<String>();
		
		actual.add("Rejected");
				
		List<String> expected = new ArrayList<String>();
		expected.addAll(Arrays.asList("Rejected"));
		
		assertEquals(expected, actual);
	}
	
	@Test(expected=NullPointerException.class)
	public void testException() {
		Event event1 = new Event(null);
		work.transitionStep(event1);
		
		Event event2 = new Event("hr ok");
		work.transitionStep(event2);
		
		Event event3 = new Event("l1 ok");
		work.transitionStep(event3);
		
		Event event4 = new Event("l2 reject");
		work.transitionStep(event4);
		
		List<Transition> actual_object = work.getTransitionList();
		List<String> actual = new ArrayList<String>() ;
		
		actual.add("rejected");
		for(Transition t : actual_object) {
			actual.add(t.initialState.stateName + " " + t.event.eventName + " " + t.finalState.stateName);
		}
		
		List<String> expected = new ArrayList<String>();
		expected.addAll(Arrays.asList());
		
		assertEquals(expected,actual);
		
		
	}
}
