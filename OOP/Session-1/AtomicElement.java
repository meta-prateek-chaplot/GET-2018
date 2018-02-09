import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Prateek
 *
 */
public class AtomicElement extends Element{
	
	/**
	 * Calls parent class constructor
	 * @param id : element id attribute
	 * @param className : element class attribute
	 */
	AtomicElement(String id, String className) {
		super(id, className);	// calling parent class for initialization
	}
	
	/**
	 * matches the id with the current element id
	 * returns the id of the element if matches
	 * @param id : element id attribute
	 */
	Element findById(String id) {
		try {
			
			if(this.id == id) {
				return this;
			}
		
		} catch(Exception e) {
			
		}
		
		return null;
	}
	
	/**
	 * matches the className with the current element className
	 * returns the className of the element if matches
	 * @param className : element class attribute
	 */
	List<Element> findByClass(String className) {
		List<Element> list = new ArrayList<Element>();
		
		try {
			
			if(this.className == className) {
				list.add(this);
			}
			
		} catch (Exception e) {
			
		}
		
		return list;
	}
	
	/**
	 * displays the HTML source code of atomic elements
	 * @param spaces : element class attribute
	 */
	List<String> displayDomRecursive(String spaces) {
		List<String> result = new ArrayList<String>();
		
		result.add(spaces + "<" + this.getClass().getSimpleName() + " id='" + this.getId() + "' class='" + this.getClassName() + "'>");
		
		return result;
	}
}
