package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnRow5 {


	@Test
	void testRow5_0_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 14 && winners[1] == 15
				&& winners[2] == 16 && winners[3] == 17;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow5_1_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 15 && winners[1] == 16
				&& winners[2] == 17 && winners[3] == 18;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}


	@Test
	void testRow5_2_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","X","X","X","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 16 && winners[1] == 17
				&& winners[2] == 18 && winners[3] == 19;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow5_3_X() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","X","X","X","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 17 && winners[1] == 18
				&& winners[2] == 19 && winners[3] == 20;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	

	@Test
	void testRow5_0_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","O","O","O","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 14 && winners[1] == 15
				&& winners[2] == 16 && winners[3] == 17;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}

	@Test
	void testRow5_1_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","O","O","O","O","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};

		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 15 && winners[1] == 16
				&& winners[2] == 17 && winners[3] == 18;
				
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow5_2_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};

		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 16 && winners[1] == 17
				&& winners[2] == 18 && winners[3] == 19;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow5_3_Circle() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","O"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 17 && winners[1] == 18
				&& winners[2] == 19 && winners[3] == 20;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	
	@Test
	void testRow5NoMatch() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","O","O","O","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	

	@Test
	void testRow5Empty() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	
   }


	

