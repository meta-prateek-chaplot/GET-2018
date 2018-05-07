
public class Guest {
	private String name;
	private int age;
	private int room;
	
	public Guest(String name, int age) {
		this.name = name;
		this.age = age;
		this.room = -1;
	}
	
	public void setRoom(int roomNo) {
		room = roomNo;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRoom() {
		return room;
	}
}
