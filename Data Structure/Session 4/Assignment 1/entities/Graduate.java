package entities;

public class Graduate extends Entity {
	public Graduate(String data) {
		super(2, data);
		this.sendToPrinter();
	}
}
