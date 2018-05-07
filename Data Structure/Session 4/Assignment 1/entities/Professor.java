package entities;

public class Professor extends Entity {
	public Professor(String data) {
		super(3, data);
		this.sendToPrinter();
	}
}
