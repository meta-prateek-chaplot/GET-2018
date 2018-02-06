/**
 * 
 * @author Prateek
 *
 */
public class Image extends AtomicElement {
	
	String source;	// Image attribute
	
	/**
	 * constructor used to assign values by calling parent class constructor
	 * @param id : element id
	 * @param className : element className
	 */
	Image(String id, String className, String source) {
		super(id, className);	// calling parent class for initialization
		this.source = source;
	}
}
