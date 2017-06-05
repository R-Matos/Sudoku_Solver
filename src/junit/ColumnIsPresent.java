package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import logic.Board;
import logic.ColumnAnalyzer;
import logic.QuadrantAnalyzer;

public class ColumnIsPresent {

	private static int[][] board = {
			{5,0,4,/**/7,0,6,/**/8,0,2},
			{3,0,6,/**/1,0,0,/**/0,0,0},
			{0,8,7,/**/0,0,5,/**/0,0,3},
			/*------------------------*/
			{8,4,0,/**/3,6,0,/**/2,7,0},
			{0,0,2,/**/8,5,9,/**/4,0,0},
			{0,1,3,/**/0,7,2,/**/0,8,6},
			/*------------------------*/
			{2,0,0,/**/9,0,0,/**/3,6,0},
			{0,0,0,/**/0,0,8,/**/1,0,7},
			{6,0,8,/**/5,0,3,/**/9,0,4}	};
	
	ColumnAnalyzer c0, c1, c2, c3, c4, c5, c6, c7, c8;

	
	@Before
	public void setUp() throws Exception {
		
		Board board = new Board(this.board);
		
		c0 = new ColumnAnalyzer(board, 0);
		c1 = new ColumnAnalyzer(board, 1);
		c2 = new ColumnAnalyzer(board, 2);
		c3 = new ColumnAnalyzer(board, 3);
		c4 = new ColumnAnalyzer(board, 4);
		c5 = new ColumnAnalyzer(board, 5);
		c6 = new ColumnAnalyzer(board, 6);
		c7 = new ColumnAnalyzer(board, 7);
		c8 = new ColumnAnalyzer(board, 8);
	}

	
	@Test
	public void q0TopTrue() {
		assertEquals(true, c0.isPresent(5));
	}
	
	@Test
	public void q0BottomTrue() {
		assertEquals(true, c0.isPresent(6));
	}
	
	@Test
	public void q8TopTrue() {
		assertEquals(true, c8.isPresent(2));
	}
	
	@Test
	public void q8BottomTrue() {
		assertEquals(true, c8.isPresent(4));
	}
	
	@Test
	public void q0False1() {
		assertEquals(false, c0.isPresent(4));
	}
	
	@Test
	public void q0False2() {
		assertEquals(false, c0.isPresent(7));
	}
	
	@Test
	public void q8False1() {
		assertEquals(false, c8.isPresent(8));
	}
	
	@Test
	public void q8False2() {
		assertEquals(false, c8.isPresent(1));
	}
	
	
	
	
	
	
	
	
	
	
}
