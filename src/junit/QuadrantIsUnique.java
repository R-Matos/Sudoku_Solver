package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import logic.Board;
import logic.QuadrantAnalyzer;

public class QuadrantIsUnique {
	
	private static int[][] board = {
			{5,0,4,/**/7,0,6,/**/8,0,2},
			{3,0,6,/**/1,0,0,/**/0,0,0},
			{0,8,5,/**/0,0,5,/**/0,0,3},
			/*------------------------*/
			{8,4,0,/**/3,6,0,/**/2,7,0},
			{0,0,2,/**/8,5,9,/**/4,0,0},
			{0,1,3,/**/0,7,2,/**/0,8,6},
			/*------------------------*/
			{2,0,0,/**/9,0,0,/**/2,6,0},
			{0,0,0,/**/0,0,8,/**/1,0,7},
			{6,0,8,/**/5,0,3,/**/9,0,2}	};
	
	QuadrantAnalyzer q0, q1, q2, q3, q4, q5, q6, q7, q8;

	
	@Before
	public void setUp() throws Exception {
		
		Board board = new Board(this.board);
		
		q0 = new QuadrantAnalyzer(board, 0);
		q1 = new QuadrantAnalyzer(board, 1);
		q2 = new QuadrantAnalyzer(board, 2);
		q3 = new QuadrantAnalyzer(board, 3);
		q4 = new QuadrantAnalyzer(board, 4);
		q5 = new QuadrantAnalyzer(board, 5);
		q6 = new QuadrantAnalyzer(board, 6);
		q7 = new QuadrantAnalyzer(board, 7);
		q8 = new QuadrantAnalyzer(board, 8);
	}
	
	
	@Test
	public void q0False() {
		assertEquals(false, q0.isUnique(5));
	}
	
	@Test
	public void q8False() {
		assertEquals(false, q8.isUnique(2));
	}
	
	@Test
	public void q0True() {
		assertEquals(true, q8.isUnique(4));
	}
	
	@Test
	public void q8True() {
		assertEquals(true, q8.isUnique(7));
	}
	
	@Test
	public void q2True() {
		assertEquals(true, q8.isUnique(3));
	}
	
	@Test
	public void q5True() {
		assertEquals(true, q8.isUnique(4));
	}
	
	@Test
	public void q1TrueNotPresent() {
		assertEquals(true, q8.isUnique(4));
	}

}
