 import static org.junit.Assert.*;

import org.junit.Test;


public class RoomTest {
	Guest[] allocatedRoomsActual;
	Guest[] allocatedRoomsExpected;
	Hash obj;
	
	@Test
	public void testAllottingRoomSuccess() {
		obj = new Hash(5);
		
		Guest g1 = new Guest("a", 11);
		allocatedRoomsActual = obj.allocateRoom(g1);
		
		Guest g2 = new Guest("b", 7);
		allocatedRoomsActual = obj.allocateRoom(g2);
		
		Guest g3 = new Guest("c", 17);
		allocatedRoomsActual = obj.allocateRoom(g3);
		
		Guest g4 = new Guest("d", 14);
		allocatedRoomsActual = obj.allocateRoom(g4);
		
		allocatedRoomsExpected = new Guest[]{null , g1,g2 ,g3 ,g4};
		assertArrayEquals(allocatedRoomsExpected, allocatedRoomsActual);
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testException() {
		obj = new Hash(5);
		Guest g1 = new Guest("a", 11);
		allocatedRoomsActual = obj.allocateRoom(g1);
		
		Guest g2 = new Guest("b", 7);
		allocatedRoomsActual = obj.allocateRoom(g2);
		
		Guest g3 = new Guest("c", 17);
		allocatedRoomsActual = obj.allocateRoom(g3);
		
		Guest g4 = new Guest("d", 14);
		allocatedRoomsActual = obj.allocateRoom(g4);
		
		Guest g5 = new Guest("e", 14);
		allocatedRoomsActual = obj.allocateRoom(g5);
		
		Guest g6 = new Guest("f", 14);
		allocatedRoomsActual = obj.allocateRoom(g6);
		
		allocatedRoomsExpected = new Guest[]{null, g1,g2 ,g3 ,g4};
}

}
