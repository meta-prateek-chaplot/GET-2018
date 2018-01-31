import static org.junit.Assert.*;

import org.junit.Test;


public class Assignment_3Test {

	Assignment_3 assign = new Assignment_3();
	
	@Test
	public void test_4_possiblity() {
		int board[][] = new int[][] {{0,0,0,0},
				{0,0,0,0}, {0,0,0,0}, {0,0,0,0}};
		boolean actual = assign.nQueen(board, 0, board.length);
		boolean expected = true;
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void test_3_possiblity() {
		int board[][] = new int[][] {{0,0,0},
				{0,0,0}, {0,0,0}};
		boolean actual = assign.nQueen(board, 0, board.length);
		boolean expected = false;
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void test_1_possiblity() {
		int board[][] = new int[][] {{0}};
		boolean actual = assign.nQueen(board, 0, board.length);
		boolean expected = true;
		
		assertTrue(expected == actual);
	}

}
