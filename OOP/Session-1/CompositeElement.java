import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Prateek
 *
 */
public class CompositeElement extends Element{
	
	List<Element> list = new ArrayList<Element>();	// list contains elements inside of the current composite element
	
	/**
	 * calls the parent class constructor
	 * @param id : element id attribute
	 * @param className : element class attribute
	 */
	CompositeElement(String id, String className) {
		super(id, className);	// calling parent class for initialization
	}
	
	/**
	 * adds the element to the composite element from which
	 * it is called
	 * @param tag : element that is to be added
	 */
	void add(Element tag) {
		try {
			list.add(tag);			
		} catch (Exception e) {
			
		}
		
	}
	
	/**
	 * used to match the id of all the elements present
	 * inside the composite element along with the element itself
	 * @param id : element id that is to be matched
	 */
	Element findById(String id) {
		try {
		
			if(this.id == id) {
				return this;
			}
			
			// loop to match elements present inside the composite element itself
			for(Element tag: list) {
				Element return_tag = tag.findById(id);
				
				if(return_tag != null) {
					return return_tag;
				}
			}
			
		} catch (Exception e) {
			
		}

		return null;
	}
	
	/**
	 * @param className : element class that is to be searched
	 */
	List<Element> findByClass(String className) {
		List<Element> result = new ArrayList<Element>();
		
		try {
			
			if(this.className.equals(className)) {
				result.add(this);
			}
			
			// loop to match elements present inside the composite element itself
			for(Element tag: list) {
				result.addAll(tag.findByClass(className));
			}
			
		} catch (Exception e) {
			
		}
		
		return result;
	}
	
	/**
	 * recursive function used to display all the elements in HTML code format
	 * @param spaces : used to give proper indentation while displaying
	 */
	List<String> displayDomRecursive(String spaces) {
		List<String> result = new ArrayList<String>();
		
		try {
			
			result.add(spaces + "<" + this.getClass().getSimpleName() + " id='" + this.getId() + "' class='" + this.getClassName() + "'>");
			
			for(Element tag: list) {
				result.addAll(tag.displayDomRecursive(spaces + "	"));
			}
			
			result.add(spaces + "</" + this.getClass().getSimpleName() + ">");
			
		} catch (Exception e) {
			
		}
		
		return result;
	}
}
