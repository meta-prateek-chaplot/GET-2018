package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import entities.*;
import facade.PrinterFacade;

public class Printer {
	private DepartmentalChairPerson deptChair;
	private Professor prof;
	private Graduate graduate;
	private Undergrad undergrad;
	private List<String> actualList;
	private List<String> expectedList;

	@Test
	public void testPrinterSuccess() {
		deptChair = new DepartmentalChairPerson("This is from department chair person");
		prof= new Professor("This is from professor");
		graduate = new Graduate("This is from grad student");
		undergrad = new Undergrad("This is from under grad student");
		
		actualList = new ArrayList<>();
		expectedList = new ArrayList<>();
		
		actualList = PrinterFacade.getInstance().print();
		
		expectedList.add("This is from under grad student");
		
		expectedList.add("This is from professor");
		expectedList.add("This is from grad student");
		expectedList.add("This is from department chair person");
		
		assertEquals(expectedList, actualList);
	}
}
