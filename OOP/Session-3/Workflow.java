import java.util.ArrayList;
import java.util.List;


public class Workflow {
	
	String workflowName;
	List<State> stateList = new ArrayList<State>();
	State currentState;
	int stateCounter=0;
	List<Event> eventList = new ArrayList<Event>();
	List<Transition> transitionList = new ArrayList<Transition>();
	
	Workflow(String workflowName) {
		this.workflowName = workflowName;
	}
	
	void addState(State state) {
		stateList.add(state);
	}
	
	void setStartState() {
		currentState = this.stateList.get(stateCounter);
	}
	
	void transitionStep(Event event) throws NullPointerException {
		if(event.eventName == " " || event.eventName == "") {
			throw new NullPointerException();
		}
		
		eventList.add(event);
		
		eventCheck(event, event.eventName);
	}
	
	String eventCheck(Event event, String eventStatus) {
		String status = null;
		
		event.setStatus(eventStatus);
		
		// if candidate status is rejected
		Transition transition;
		
		if(event.getStatus() == false) {
			status = "Rejected";
			
			transition = new Transition(currentState, currentState, event);
		}
		else {
			currentState = stateList.get(++stateCounter);
			
			if(currentState.stateName == "Offer") {
				status = "Selected";
			}
			
			transition = new Transition(stateList.get(stateCounter-1), currentState, event);
		}
		
		transitionList.add(transition);
		
		return status;
	}
	
	List<Transition> getTransitionList() {
		return transitionList;
	}
}
