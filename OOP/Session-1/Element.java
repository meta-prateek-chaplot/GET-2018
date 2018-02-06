import java.util.List;
/**
 * 
 * @author Prateek
 *
 */
abstract class Element {
	String id;	// id of tag
	String className; // class of tag
	
	/**
	 * constructor used to assign values
	 * @param id
	 * @param className
	 */
	Element(String id, String className) {
		this.id = id;	// initializing id
		this.className = className;
	}
	
	/**
	 * used to get element id
	 * @return
	 */
	String getId() {
		return id;
	}
	
	/**
	 * used to get className of the element
	 * @return
	 */
	String getClassName() {
		return className;
	}
	
	/**
	 * find id function to be overridden
	 * @param id
	 * @return element matched
	 */
	Element findById(String id) {
		return null;
	}
	
	/**
	 * find id function to be overridden
	 * @param className
	 * @return list of elements matched
	 */
	List<Element> findByClass(String className) {
		return null;
	}
	
	/**
	 * display function to be overridden
	 * @param spaces : used to indentation purpose
	 * @return the string containing HTML code
	 */
	List<String> displayDomRecursive(String spaces) {
		return null;
	}
	
}
