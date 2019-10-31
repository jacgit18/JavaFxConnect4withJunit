package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestColum1Position {
<<<<<<< HEAD

=======
// debug and find out logic
>>>>>>> branch 'master' of https://github.com/jacgit18/JavaFxConnect4withJunit.git
	@Test
	void test1() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 35, "validPosition: " + validPosition);

	}

	@Test
	void test2() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 28, "validPosition: " + validPosition);
	
	}

	@Test
	void test3() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 21, "validPosition: " + validPosition);
	
	}	
	
	@Test
	void test4() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 14, "validPosition: " + validPosition);
	
	}
	
	@Test
	void test5() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 7, "validPosition: " + validPosition);
	
	}	
	
	@Test
	void test6() {
		String[] moves = {"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"
				         ,"O","?","?","?","?","?","?"
				         ,"X","?","?","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 0, "validPosition: " + validPosition);
	
	}	
   }
	

