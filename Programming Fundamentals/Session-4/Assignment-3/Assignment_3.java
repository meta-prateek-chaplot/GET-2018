
public class Assignment_3 {
	
	/**
	 * function used to solve n queen problem
	 * @param board
	 * @param startRow
	 * @param dimensionOfMatrix
	 * @return
	 */
	boolean nQueen(int board[][], int startRow, int dimensionOfMatrix) {
		if(solveNQueen(board, 0) == false) {
			return false;
		}
		
//		printSolution(board);
		return true;
	}
	
	/*
	int[][] printSolution(int board[][]) {
		int size = board.length;
		int res[][] = new int[size][size];
		
		int rowLength = board.length;
		int colLength = board[0].length;
		
		for(int i=0; i<rowLength; i++) {
			for(int j=0; j<colLength; j++) {
				res[i][j] = board[i][j];
			}
		}
		
		return res;
	}
	*/
	/**
	 * places queen in every possible manner and checks
	 * whether it is possible or not
	 * @param board
	 * @param col
	 * @return
	 */
	boolean solveNQueen(int board[][], int col) {
		int size = board.length;
		if(col>=size) {
			return true;
		}
		
		for(int i=0; i<size; i++) {
			if(isSafe(board, i, col)) {
				board[i][col]=1;
				
				if(solveNQueen(board, col+1)) {
					return true;
				}
				
				board[i][col]=0;
			}
		}
		
		return false;
	}
	/**
	 * checks whether it is possible to place a queen
	 * with safe board or not
	 * @param board
	 * @param row
	 * @param col
	 * @return
	 */
	boolean isSafe(int board[][], int row, int col) {
		int i, j;
		int size = board.length;
		
		for(i=0; i<col; i++) {
			if(board[row][i] == 1) {
				return false;
			}
		}
		
		for(i=row, j=col; i>=0 && j>=0; i--, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		for(i=row, j=col; i<size && j>=0; i++, j--) {
			if(board[i][j] == 1) {
				return false;
			}
		}
		
		return true;
	}
}
