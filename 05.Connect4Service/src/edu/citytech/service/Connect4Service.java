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
		

		if (findWinner(moves[0], moves[1], moves[2], moves[3])) {
			status = new int [] {0,1,2,3};
		}
		
		else if (findWinner(moves[1], moves[2], moves[3], moves[4])) {
			status = new int [] {1,2,3,4};
		}
		
		else if (findWinner(moves[2], moves[3], moves[4], moves[5])) {
			status = new int [] {2,3,4,5};
		}
		
		return status;
	}
	
	private static boolean findWinner(String p1, String p2, String p3, String p4) {
		boolean status = p1.equals(p2)&& p2.equals(p3) && p3.equals(p4)&& !p1.equals("?") ; 
		
		
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
