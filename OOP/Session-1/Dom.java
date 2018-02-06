import java.util.List;
/**
 * 
 * @author Prateek
 *
 */
public class Dom {
	
	Element element;	// used to hold the root element
	
	/**
	 * constructor used to hold the root element
	 * @param root : main element of the DOM
	 */
	Dom(Element root) {
		element = (CompositeElement) root;
	}
	
	/**
	 * used to find id with given id attribute
	 * @param id : element id to be searched
	 * @return null or element with id matched
	 */
	Element findElementById(String id) {
		return this.element.findById(id);
	}
	
	/**
	 * used to find the class with given className
	 * @param className : element className to be searched
	 * @return null or the list of elements matched
	 */
	List<Element> findElementsByClass(String className) {
		return this.element.findByClass(className);
	}
	
	/**
	 * used to find the HTML source code
	 * @return the string containing the HTML source code
	 */
	List<String> displayDom() {
		return this.element.displayDomRecursive("");
	}
}
