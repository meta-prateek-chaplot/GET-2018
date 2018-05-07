package entities;

public class DepartmentalChairPerson extends Entity {
	public DepartmentalChairPerson(String data) {
		super(4, data);
		this.sendToPrinter();
	}
}
