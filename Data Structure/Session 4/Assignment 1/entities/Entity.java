package entities;

import facade.PrinterFacade;

public class Entity {
	
	private int priority;	// priority for job sequencing
	private String data;	// data to print
	
	public Entity(int priority, String data) {
		this.priority = priority;
		this.data = data;
	}
	
	public void sendToPrinter() {
		PrinterFacade.getInstance().addToPrint(this);
	}
	
	public String toString() {
		return this.data;
	}
	
	public int compareTo(Entity entity) {
		return ( (this.priority > entity.priority) ? 1 : -1 );
	}
}
