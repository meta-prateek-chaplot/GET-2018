/**
 * 
 * @author Prateek
 *
 */
public class Transition {
	State initialState;		// initial state of a transition
	State finalState;		// final state of a transition
	Event event;		// used to store the event where transition takes place
	
	/**
	 * constructor used to initialize 'initialState' 'finalState' and 'event'
	 * @param initialState
	 * @param finalState
	 * @param event
	 */
	Transition(State initialState, State finalState, Event event) {
		this.initialState = initialState;
		this.finalState = finalState;
		this.event = event;
	}
	
	/**
	 * getter used to get 'initialState'
	 * @return
	 */
	State getInitialState() {
		return initialState;
	}
	
	/**
	 * getter used to get 'finalState'
	 * @return
	 */
	State getFinalState() {
		return finalState;
	}
	
	/**
	 * getter used to get 'event'
	 * @return
	 */
	Event getEvent() {
		return event;
	}
}
