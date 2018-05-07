
public class Hash {
	Guest[] allocatedRooms;
	int noOfRooms;
	
	public Hash(int numOfRooms) {
		noOfRooms = numOfRooms;
		allocatedRooms = new Guest[numOfRooms];
	}
	
	private int generateRoomNo(int age) {
		return age % noOfRooms;
	}
	
	public Guest[] allocateRoom(Guest guest) {
		try {
			int roomNum = 0;
			int flag = 0;

			while(allocatedRooms[flag] != null) {
				flag++;
			}

			if(flag == noOfRooms) {
				throw new ArrayIndexOutOfBoundsException();
			} else {
				roomNum = generateRoomNo(guest.getAge());
				
				while(allocatedRooms[roomNum] != null) {
					roomNum = (roomNum + 1) % noOfRooms;
				}
			
				allocatedRooms[roomNum] = guest;
				guest.setRoom(roomNum);
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return allocatedRooms;
	}
	
	public String getGuestDetails(String name, int age) {
		try {
			for(int i = 0; i < noOfRooms; i++) {
				if(allocatedRooms[i] == null) {
					continue;
				}
				
				if(allocatedRooms[i].getAge() == age && allocatedRooms[i].getName() == name) {
					return  "name is " + name + "  room no is " + allocatedRooms[i].getRoom();
				}
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Not Found";
	}
}
