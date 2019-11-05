package edu.citytech.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import edu.citytech.dao.WinningCombo;
import edu.citytech.dao.WinningComboDAO;

public class Connect4Service {

	public static int getValidCellMoves(String[] moves, int i) {
		
			
				return 35;
			}
	


	public static int[] getWinner(String[] moves) {

		int [] status = {};
		WinningComboDAO  dao = new WinningComboDAO();
		List<WinningCombo> list = dao.findAll();
		// Rows

		for (WinningCombo wc : list) {
			
		
		if (findWinner(moves[wc.p1], moves[wc.p2], moves[wc.p3], moves[wc.p4])) {
			status = new int [] {wc.p1,wc.p2,wc.p3,wc.p4};
			break;
		}
		}
		
		return status;
	}
	
	private static boolean findWinner(String p1, String p2, String p3, String p4) {
		boolean status = p1.equals(p2)&& p2.equals(p3) && p3.equals(p4)&& !p1.equals("?") ; 
		
		
		return status;
	}
}

