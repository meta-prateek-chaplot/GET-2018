import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

public class oopTest {

	static Dom dom;
	
	@BeforeClass
	 public static void doBefore() {
		Root root = new Root("0","main");
		dom = new Dom(root);
		
		Div div1 = new Div("1", "abc");
		Div div2 = new Div("2", "abc");
		Div div3 = new Div("3", "abcd");
		
		Image img3 = new Image("7", "ab", "http://www.google.com");
		Image img1 = new Image("8", "abc", "http://www.microsoft.com"); 
		Image img2 = new Image("9", "ab", "http://www.yahoo.com"); 
		
		((CompositeElement) root).add(div1);
		
		div1.add(div2);
		div2.add(div3);
		div3.add(img3);
		
		((CompositeElement) root).add(img1);
		
		div1.add(img2);
	}
	
	@Test
	public void idTest() {
		
		String actual = dom.findElementById("8").getClass().getSimpleName();
		String expected = "Image" ;
		assertEquals(expected,actual);
		
	}
	
	@Test
	public void className_test() {
		
		List<Element> actual2 = dom.findElementsByClass("abc");
		List<String> result = new ArrayList<String>();
		for ( Element listElement : actual2) {
 			result.add(listElement.getClass().getSimpleName());
 		}
		List<String> expected = new ArrayList<String>();
		expected.addAll( Arrays.asList("Div","Div","Image"));
		assertEquals(expected,result);
		
	}
	
	@Test
	public void dom_test() {
		
		List<String> expected= new ArrayList<String>();
		expected.addAll(Arrays.asList("<Root id='0' class='main'>",
			"	<Div id='1' class='abc'>",
			"		<Div id='2' class='abc'>",
			"			<Div id='3' class='abcd'>",
			"				<Image id='7' class='ab'>",
			"			</Div>",
			"		</Div>",
			"		<Image id='9' class='ab'>",
			"	</Div>",
			"	<Image id='8' class='abc'>",
			"</Root>"));
		
		List<String> actual = dom.displayDom();
		
		assertEquals(expected,actual);
	}
}
