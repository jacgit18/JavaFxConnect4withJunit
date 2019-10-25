package edu.citytech.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.citytech.service.Connect4Service;

class TestColum3 {

	@Test
	void test1() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 37, "validPosition: " + validPosition);

	}

	@Test
	void test2() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 30, "validPosition: " + validPosition);
	
	}

	@Test
	void test3() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 23, "validPosition: " + validPosition);
	
	}	
	
	@Test
	void test4() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","?","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 16, "validPosition: " + validPosition);
	
	}
	
	@Test
	void test5() {
		String[] moves = {"?","?","?","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"};
				
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 9, "validPosition: " + validPosition);
	
	}	
	
	@Test
	void test6() {
		String[] moves = {"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"
				         ,"?","?","O","?","?","?","?"
				         ,"?","?","X","?","?","?","?"};
		
		int validPosition = Connect4Service.getValidCellMoves(moves, 0);
		assertTrue(validPosition == 2, "validPosition: " + validPosition);
	
	}	
   }
	

