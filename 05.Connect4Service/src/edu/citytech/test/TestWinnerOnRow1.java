package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestWinnerOnRow1 {

	@Test
	void testRow1() {
		String[] moves = {"X","X","X","X","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 0 && winners[1] == 1
				&& winners[2] == 2 && winners[3] == 3;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}

	@Test
	void testRow1b() {
		String[] moves = {"?","X","X","X","X","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 1 && winners[1] == 2
				&& winners[2] == 3 && winners[3] == 4;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}

	@Test
	void testRow1c() {
		String[] moves = {"?","?","O","O","O","O","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners[0] == 2 && winners[1] == 3
				&& winners[2] == 4 && winners[3] == 5;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
	
	@Test
	void testRow1D() {
		String[] moves = {"?","?","?","O","O","O","X"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int [] winners = Connect4Service.getWinner(moves);
		boolean c1 = winners.length == 0;
		
		assertTrue(c1, "validPosition: " + Arrays.toString(winners));

	}
   }
	

