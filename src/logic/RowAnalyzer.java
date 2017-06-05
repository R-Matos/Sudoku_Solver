package logic;

public class RowAnalyzer {
	
	
	private Board board;
	private int row;
	
	
	public RowAnalyzer(Board board, int row) {
		this.board = board;
		this.row = row;
	}
	
	
	
	public boolean isPresent(int value) {
		
		for (int i = 0; i <= 8; i++) {
			if (board.getState()[row][i] == value) {
				return true;
			}
		}

		return false;	
	}
	
	public boolean isUnique(int value) {

		int valueCounter = 0;
		
		for (int i = 0; i <= 8; i++) {
			if (board.getState()[row][i] == value) {
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
