/**
 * 
 * @author Prateek
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Workflow {
	String workflowName;	// store the name of work flow
	List<State> stateList = new ArrayList<State>();		// stores all the states in list
	State currentState;		// to get the current state in function 'eventCheck' and in 'setStartState'
	int stateCounter=0;		// used in function 'eventCheck' for getting the next state from 'stateList'
	List<Event> eventList = new ArrayList<Event>();		// stores all the events in list
	List<Transition> transitionList = new ArrayList<Transition>();	// stores all the transitions in list
	
	/**
	 * constructor to initialize the name of work flow
	 * @param workflowName
	 */
	Workflow(String workflowName) {
		this.workflowName = workflowName;
	}
	
	/**
	 * used to add the 'state' to 'stateList'
	 * @param state
	 */
	void addState(State state) {
		stateList.add(state);
	}
	
	/**
	 * used to set the value of 'currentState'
	 */
	void setStartState() {
		currentState = this.stateList.get(0);
	}
	
	/**
	 * used to add 'event' to 'eventList' and calls 'eventCheck'
	 * @param event
	 * @throws NullPointerException
	 */
	void transitionStep(Event event) throws NullPointerException {
		if(event.eventName == " " || event.eventName == "") {
			throw new NullPointerException();
		}
		
		eventList.add(event);
		
		eventCheck(event, event.eventName);
	}
	
	/**
	 * used to add 'transition' to 'transitionList'
	 * @param event
	 * @param eventStatus
	 * @return
	 */
	String eventCheck(Event event, String eventStatus) {
		String status = null;
		
		event.setStatus(eventStatus);
		
		// if-else candidate status
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
	
	/**
	 * getter function to get transitionList
	 * @return transitionList of type List<Transition>
	 */
	List<Transition> getTransitionList() {
		return transitionList;
	}
}
