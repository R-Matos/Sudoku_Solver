package logic;

public class Board {
	
	private int[][] state;
	
	
	public Board(int[][] boardState) {
		this.state = boardState;
	}
	
	
	public int[][] getState() {
		return state;
	}

	
}
