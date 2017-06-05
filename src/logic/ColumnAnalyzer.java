package logic;

public class ColumnAnalyzer {
	
	
	private Board board;
	private int column;
	
	
	public ColumnAnalyzer(Board board, int column) {
		this.board = board;
		this.column = column;
	}
	
	
	
	public boolean isPresent(int value) {
		
		for (int i = 0; i <= 8; i++) {
			if (board.getState()[i][column] == value) {
				return true;
			}
		}

		return false;	
	}
	
	public boolean isUnique(int value) {

		int valueCounter = 0;
		
		for (int i = 0; i <= 8; i++) {
			if (board.getState()[i][column] == value) {
				valueCounter++;
			}
		}

		if (valueCounter > 1) {
			return false;
		} else {
			return true;
		}
	}
	
	
	
	
	
	
	
	
	
	

}
