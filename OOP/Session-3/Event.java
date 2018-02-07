
public class Event {
	String eventName;
	boolean status;	// variable to check whether the event is positive or negative
	
	Event(String eventName) {
		this.eventName = eventName;
	}
	
	String getEventName() {
		return eventName;
	}
	
	void setStatus(String eventStatus) {
		eventStatus = eventStatus.toLowerCase();
		
		if(eventStatus.contains("reject")) {
			status = false;
		}
		else {
			status = true;
		}
	}
	
	boolean getStatus() {
		return status;
	}
}
