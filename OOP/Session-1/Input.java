/**
 * 
 * @author Prateek
 *
 */
public class Input extends AtomicElement {
	
	String text;	// Input attribute
	
	/**
	 * constructor used to assign values by calling parent class constructor
	 * @param id : element id
	 * @param className : element className
	 */
	Input(String id, String className, String text) {
		super(id, className); // calling parent class for initialization
		this.text = text;
	}
}
