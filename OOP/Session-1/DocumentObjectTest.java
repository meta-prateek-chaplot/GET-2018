import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Prateek
 *
 */
public class DocumentObjectTest {

	@Test
	public void OopTest() {
		Dom dom = new Dom();
		CompositeElement div1 = new Div("1", "abc");
		dom.add(div1);
		CompositeElement div2 = new Div("0", "abc");
		div1.add(div2);
		CompositeElement div3 = new Div("4", "abcd");
		div2.add(div3);
		AtomicElement img3 = new Img("6", "ab", "abcdef");
		div3.add(img3);
		AtomicElement img1 = new Img("3", "ab", "abcd"); 
		dom.add(img1);
		AtomicElement img2 = new Img("8", "ab", "abcde"); 
		div1.add(img2);
		
		String actual = dom.findElementByID("8").getClass().getSimpleName();
		String expected = "Img";
		
		assertEquals(expected, actual);
	}

}
