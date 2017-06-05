package mvc;

import static org.junit.Assert.assertEquals;

import logic.Board;
import logic.ColumnAnalyzer;
import logic.QuadrantAnalyzer;
import logic.RowAnalyzer;


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
	private static Controller controller;
	
	
	public void solve(Board board, Controller controller) {
		
		this.board = board;
		this.controller = controller;
		
		inputCheck();
		
	}
	
	
	
	private void inputCheck() {
		
		boolean quadrantCheck = isQuadrantsValid();
		boolean columnCheck = isColumnsValid();
		boolean rowCheck = isRowsValid();
		
		if (quadrantCheck && columnCheck && rowCheck) {
			controller.gridPane.setStyle("-fx-border-color: black;");
		} else {
			controller.gridPane.setStyle("-fx-border-color: red;");
			//TODO: Error message
		}
	}
	
	
	private boolean isQuadrantsValid() {
		
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
	
	
	private boolean isColumnsValid() {
		
		for (int i = 0; i <= 8; i++) {										//For each column
			ColumnAnalyzer cAnalyzer = new ColumnAnalyzer(board, i);
			for (int j = 1; j <= 9; j++) {									//For each value
				
				if (!cAnalyzer.isUnique(j)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	private boolean isRowsValid() {
		
		for (int i = 0; i <= 8; i++) {										//For each column
			RowAnalyzer rAnalyzer = new RowAnalyzer(board, i);
			for (int j = 1; j <= 9; j++) {									//For each value
				
				if (!rAnalyzer.isUnique(j)) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}

