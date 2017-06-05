package logic;

//Determines if a row, column or quadrant contains repeated values 

public class QuadrantAnalyzer {
	
	
	private Board board;
	private int quadrant;
	private int xCoord;												//First element in quadrant coordinate
	private int yCoord;												//First element in quadrant coordinate
	private int value;
	
	public QuadrantAnalyzer (Board board, int quadrant) {
		this.board = board;
		this.quadrant = quadrant;
		
		switch (quadrant) {
			case 0 : this.xCoord = 0; this.yCoord = 0;	break;
			case 1 : this.xCoord = 0; this.yCoord = 3;	break; 		
			case 2 : this.xCoord = 0; this.yCoord = 6;	break;
			case 3 : this.xCoord = 3; this.yCoord = 0;	break;
			case 4 : this.xCoord = 3; this.yCoord = 3;	break;
			case 5 : this.xCoord = 3; this.yCoord = 6;	break;
			case 6 : this.xCoord = 6; this.yCoord = 0;	break;
			case 7 : this.xCoord = 6; this.yCoord = 3;	break;
			case 8 : this.xCoord = 6; this.yCoord = 6;	break;
		default :
			throw new IllegalArgumentException("Impossible element value. Only 0-8 is valid.");
		}
	}
	
	
	//Returns true if value is in quadrant
	public boolean isPresent (int value) {
		
		for (int i = xCoord; i <= xCoord+2; i++) {
			for (int j = yCoord; j <= yCoord+2; j++) {

				if (board.getState()[i][j] == value) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	
	//Returns true if no duplicate values in quadrant
	public boolean isUnique (int value) {
		
		int valueCounter = 0;
		
		for (int i = xCoord; i <= xCoord+2; i++) {
			for (int j = yCoord; j <= yCoord+2; j++) {

				if (board.getState()[i][j] == value) {
					valueCounter++;
				}
			}
		}
		
		if (valueCounter > 1) {
			return false;
		} else {
			return true;
		}
	}
	

		
	
	
	

}
