package edu.citytech.service;

public class Connect4Service {

	public static int getValidCellMoves(String[] moves, int i) {
		
		
    	// try multi-dimensional array button will be filled first
//		 String [] [] moves1 = new String[6] [6]; // grid is 6 by 6

		
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
		boolean isWinner = findWinner(moves[0], moves[1], moves[2], moves[3])

		if (isWinner) {
			status = new int [] {0,1,2,3};
		}
		
		return status;
	}
	
	private static boolean [] findWinner(String p1, String p2, String p3, String p4) {
		boolean status = p1.equals("X") && p2.equals("X") && 
			p3.equals("X") && p4.equals("X");
		
		
		return status;
	}
	
//	public static int[] getWinner(String[] moves) {
//
//      boolean status = moves [0] == "X" && moves [1] == "X" 
//				&& moves [2] == "X" && moves [3] == "X";
//
//		if ( status == true) {
//	
//
//    
//		 }
//		return status;
//
//
//		
//
////		 
////   			 while (mymoves < moves.length) {
////   	 status = moves [mymoves].equals("?");
////   	
////   	if (status) {
////   		mymoves = mymoves + 7;
////			
////		}else{
////			break;
////		}
////   }
//		
//
//		
//		
//	}

}
