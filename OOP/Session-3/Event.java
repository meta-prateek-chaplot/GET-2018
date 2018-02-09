/**
 * 
 * @author Prateek
 *
 */
public class Event {
	String eventName;	// to store name of event
	boolean status;	// to check whether the event is positive or negative
	
	/**
	 * constructor to initialize eventName
	 * @param eventName
	 */
	Event(String eventName) {
		this.eventName = eventName;
	}
	
	/**
	 * getter function
	 * @return string : eventName
	 */
	String getEventName() {
		return eventName;
	}
	
	/**
	 * used to set the value to boolean status
	 * that whether the event is positive or negative
	 * @param eventStatus
	 */
	void setStatus(String eventStatus) {
		eventStatus = eventStatus.toLowerCase();
		
		if(eventStatus.contains("reject")) {
			status = false;
		}
		else {
			status = true;
		}
	}
	
	/**
	 * getter function to get status of event
	 * @return
	 */
	boolean getStatus() {
		return status;
	}
}
