package facade;

import java.util.ArrayList;
import java.util.List;

import entities.Entity;

public class PrinterFacade {
	private static PrinterFacade printer;
	
	private Heap<Entity> queue = new Heap<>();
	
	private List<String> printPool = new ArrayList<>();
	
	private PrinterFacade() {
		
	}
	
	public static PrinterFacade getInstance() {
		if(printer == null) {
			printer = new PrinterFacade();
		}
		
		return printer;
	}
	
	public void addToPrint(Entity item) {	
		queue.addItem(item);
	}
	
	public List<String> print() {
		try {

			while(!queue.isEmpty()) {
				printPool.add(queue.removeMax().toString());
				print();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return printPool;
	}
}
