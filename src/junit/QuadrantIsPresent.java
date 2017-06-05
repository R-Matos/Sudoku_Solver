package junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logic.Board;
import logic.QuadrantAnalyzer;

public class QuadrantIsPresent {

	
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
	public void q0e0True() {
		Board board = new Board(this.board);
		QuadrantAnalyzer test = new QuadrantAnalyzer(board, 0);
		assertEquals(true, q0.isPresent(5));
	}
	
	@Test
	public void q0e8True() {
		assertEquals(true, q0.isPresent(7));
	}
	
	@Test
	public void q1e0True() {
		assertEquals(true, q1.isPresent(7));
	}
	
	@Test
	public void q1e8True() {
		assertEquals(true, q1.isPresent(5));
	}
	
	@Test
	public void q2e0True() {
		assertEquals(true, q2.isPresent(8));
	}
	
	@Test
	public void q2e8True() {
		assertEquals(true, q2.isPresent(3));
	}

	@Test
	public void q3e0True() {
		assertEquals(true, q3.isPresent(8));
	}
	
	@Test
	public void q3e8True() {
		assertEquals(true, q3.isPresent(3));
	}
	
	@Test
	public void q4e0True() {
		assertEquals(true, q4.isPresent(3));
	}
	
	@Test
	public void q4e8True() {
		assertEquals(true, q4.isPresent(2));
	}

	@Test
	public void q5e0True() {
		assertEquals(true, q5.isPresent(2));
	}
	
	@Test
	public void q5e8True() {
		assertEquals(true, q5.isPresent(6));
	}
	
	@Test
	public void q6e0True() {
		assertEquals(true, q6.isPresent(2));
	}
	
	@Test
	public void q6e8True() {
		assertEquals(true, q6.isPresent(8));
	}
	
	@Test
	public void q7e0True() {
		assertEquals(true, q7.isPresent(9));
	}
	
	@Test
	public void q7e8True() {
		assertEquals(true, q7.isPresent(3));
	}
	
	@Test
	public void q8e0True() {
		assertEquals(true, q8.isPresent(3));
	}
	
	@Test
	public void q8e8True() {
		assertEquals(true, q8.isPresent(4));
	}
	
	public void q0False1() {
		assertEquals(false, q0.isPresent(9));
	}
	
	public void q0False2() {
		assertEquals(false, q0.isPresent(2));
	}
	
	public void q0False3() {
		assertEquals(false, q0.isPresent(1));
	}
	
	public void q1False1() {
		assertEquals(false, q1.isPresent(3));
	}
	
	public void q1False2() {
		assertEquals(false, q1.isPresent(8));
	}
	
	public void q1False3() {
		assertEquals(false, q1.isPresent(2));
	}
	
	public void q2False1() {
		assertEquals(false, q2.isPresent(1));
	}
	
	public void q2False2() {
		assertEquals(false, q2.isPresent(9));
	}
	
	public void q2False3() {
		assertEquals(false, q2.isPresent(2));
	}
	
	public void q3False1() {
		assertEquals(false, q3.isPresent(5));
	}
	
	public void q3False2() {
		assertEquals(false, q3.isPresent(6));
	}
	
	public void q3False3() {
		assertEquals(false, q3.isPresent(9));
	}
	
	public void q4False1() {
		assertEquals(false, q4.isPresent(1));
	}
	
	public void q4False2() {
		assertEquals(false, q4.isPresent(4));
	}
	
	public void q5False5() {
		assertEquals(false, q5.isPresent(9));
	}
	
	public void q5False2() {
		assertEquals(false, q5.isPresent(3));
	}
	
	public void q5False3() {
		assertEquals(false, q5.isPresent(5));
	}
	
	public void q6False1() {
		assertEquals(false, q6.isPresent(1));
	}
	
	public void q6False2() {
		assertEquals(false, q6.isPresent(3));
	}
	
	public void q6False3() {
		assertEquals(false, q6.isPresent(7));
	}
	
	public void q7False1() {
		assertEquals(false, q7.isPresent(7));
	}
	
	public void q7False2() {
		assertEquals(false, q7.isPresent(2));
	}
	
	public void q7False3() {
		assertEquals(false, q7.isPresent(1));
	}
	
	public void q8False8() {
		assertEquals(false, q8.isPresent(8));
	}
	
	public void q8False2() {
		assertEquals(false, q8.isPresent(5));
	}
	
	public void q8False3() {
		assertEquals(false, q8.isPresent(2));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
