package entities;

public class Undergrad extends Entity {
	public Undergrad(String data) {
		super(1, data);
		this.sendToPrinter();
	}
}
