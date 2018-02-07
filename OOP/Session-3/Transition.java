
public class Transition {
	State initialState, finalState;
	Event event;
	
	Transition(State initialState, State finalState, Event event) {
		this.initialState = initialState;
		this.finalState = finalState;
		this.event = event;
	}
	
	State getInitialState() {
		return initialState;
	}
	
	State getFinalState() {
		return finalState;
	}
	
	Event getEvent() {
		return event;
	}
}
