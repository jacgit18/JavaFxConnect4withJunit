package edu.citytech.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class Connect4Service {

	public static int getValidCellMoves(String[] moves, int i) {
		
		
    	// try multi-dimensional array button will be filled first
        // String [] [] moves1 = new String[6] [6]; // grid is 6 by 6

		
    			 int p = i;
    			 boolean status;

    			 
		    			 while (p < moves.length) {
		    	 status = moves [p].equals("?");
		    	
		    	if (status) {
					p = p + 7;
					
				}else{
					break;
				}
		    }
				
				return p;
			}
	
	
	/**
	 * if no winner is found return an empty array
	 * @param moves
	 * @return
	 */

	public static int[] getWinner(String[] moves) {

		int [] status = {};
		
		// Rows

		if (findWinner(moves[0], moves[1], moves[2], moves[3])) {
			status = new int [] {0,1,2,3};
		}
		
		
		else if (findWinner(moves[1], moves[2], moves[3], moves[4])) {
			status = new int [] {1,2,3,4};
		}
		
		else if (findWinner(moves[2], moves[3], moves[4], moves[5])) {
			
			status = new int [] {2,3,4,5};
		}
		
		else if (findWinner(moves[3], moves[4], moves[5], moves[6])) {
			status = new int [] {3,4,5,6};
		}
		
		else if (findWinner( moves[7], moves[8], moves[9], moves[10])) {
			status = new int [] {7,8,9,10};
		}
		
		else if (findWinner( moves[8], moves[9], moves[10], moves[11] )) {
			status = new int [] {8,9,10,11};
		}
		
		else if (findWinner( moves[9], moves[10], moves[11], moves[12] )) {
			status = new int [] {9,10,11,12};
		}
		
		else if (findWinner(moves[10], moves[11], moves[12],  moves[13]  )) {
			status = new int [] {10,11,12,13};
		}
		
		else if (findWinner(moves[14], moves[15], moves[16],  moves[17]  )) {
			status = new int [] {14,15,16,17};
		}
		
		else if (findWinner(moves[15], moves[16], moves[17],  moves[18]  )) {
			status = new int [] {15,16,17,18};
		}
		
		else if (findWinner(moves[16], moves[17], moves[18],  moves[19]  )) {
			status = new int [] {16,17,18,19};
		}
		
		else if (findWinner(moves[17], moves[18],  moves[19], moves[20]  )) {
			status = new int [] {17,18,19, 20};
		}
		
		else if (findWinner(moves[21], moves[22],  moves[23], moves[24]  )) {
			status = new int [] {21,22,23, 24};
		}
		
		else if (findWinner(moves[22],  moves[23], moves[24], moves[25]  )) {
			status = new int [] {22,23,24,25};
		}
		
		else if (findWinner(moves[23], moves[24], moves[25], moves[26]  )) {
			status = new int [] {23, 24,25, 26};
		}
		else if (findWinner(moves[24], moves[25], moves[26], moves[27]  )) {
			status = new int [] {24,25, 26, 27};
		}
		
		
	
		// Columns
		else if (findWinner(moves[0], moves[7], moves[14], moves[21])) {
			status = new int [] {0,7,14,21};
		}
		
		else if (findWinner(moves[1], moves[8], moves[15], moves[22])) {
			status = new int [] {1,8,15,22};
		}
		
		else if (findWinner( moves[7], moves[14], moves[21], moves[28])) {
			status = new int [] {7,14,21,28};
		}
		
		else if (findWinner(moves[8], moves[15], moves[22], moves[29])) {
			status = new int [] {8,15,22,29};
		}
		
		else if (findWinner( moves[14], moves[21], moves[28], moves[35] )) {
			status = new int [] {14,21,28,35};
		}
		
		else if (findWinner(moves[15], moves[22], moves[29], moves[36])) {
			status = new int [] {15,22,29,36};
		}
		
		
		// diag
		else if (findWinner(moves[0], moves[8], moves[16], moves[24])) {
			status = new int [] {0,8,16,24};
		}
		
		else if (findWinner(moves[1], moves[9], moves[17], moves[25])) {
			status = new int [] {1,9,17,25};
		}
		
		else if (findWinner(moves[2], moves[10], moves[18], moves[26])) {
			status = new int [] {2,10,18,26};
		}
		
		else if (findWinner(moves[3], moves[11], moves[19], moves[27])) {
			status = new int [] {3,11,19,27};
		}
		
		else if (findWinner(moves[7], moves[15], moves[23], moves[31])) {
			status = new int [] {7,15,23,31};
		}
		
		else if (findWinner(moves[8], moves[16], moves[24], moves[32])) {
			status = new int [] {8,16,24,32};
		}
		
		else if (findWinner(moves[9], moves[17], moves[25], moves[33])) {
			status = new int [] {9,17,25,33};
		}
		
		else if (findWinner(moves[10], moves[18], moves[26], moves[34])) {
			status = new int [] {10,18,26,34};
		}
		
		else if (findWinner(moves[14], moves[22], moves[30], moves[38])) {
			status = new int [] {14,22,30,38};
		}
		
		else if (findWinner(moves[15], moves[23], moves[31], moves[39])) {
			status = new int [] {15,23,31,39};
		}
		
		else if (findWinner(moves[16], moves[24], moves[32], moves[40])) {
			status = new int [] {16,24,32,40};
		}
		
		else if (findWinner(moves[17], moves[25], moves[33], moves[41])) {
			status = new int [] {17,25,33,41};
		}
		
		return status;
	}
	
	private static boolean findWinner(String p1, String p2, String p3, String p4) {
		boolean status = p1.equals(p2)&& p2.equals(p3) && p3.equals(p4)&& !p1.equals("?") ; 
		
		
		return status;
	}
	


}
