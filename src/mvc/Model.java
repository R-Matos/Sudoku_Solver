package mvc;

import static org.junit.Assert.assertEquals;

import logic.Board;
import logic.QuadrantAnalyzer;


public class Model {

	//Board board;
/*	private static int[][] board = {
			{4,6,0,7,2,0,9,0,0},
			{0,7,0,0,8,0,6,5,2},
			{8,0,2,0,0,5,0,7,0},
			------------------------
			{6,3,0,0,0,0,0,0,9},
			{0,0,8,0,0,0,1,0,0},
			{9,0,0,0,0,1,0,8,4},
			------------------------
			{0,4,0,2,0,0,8,0,5},
			{1,2,6,0,5,0,0,4,0},
			{0,0,9,0,4,7,0,1,6}	};*/
	
	private static Board board;
	
	
	public void solve(Board board) {
		
		this.board = board;
		
		boolean inputCheck = inputCheck();
		
		System.out.print(inputCheck);
	}
	
	
	private boolean inputCheck() {
		
		boolean quadrantCheck = quadrantCheck();
		boolean columnCheck = columnCheck();
		boolean rowCheck;
		
		return columnCheck;
	}
	
	
	private boolean quadrantCheck() {
		
		for (int i = 0; i <= 8; i++) {											//For each quadrant

			QuadrantAnalyzer qAnalyzer = new QuadrantAnalyzer(board, i);
			
			for (int j = 1; j <= 9; j++) {										//For each value
				 
				if (!qAnalyzer.isUnique(j)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	private boolean columnCheck() {
		
		return false;
	}
	
	
}

