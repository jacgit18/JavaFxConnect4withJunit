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

	public static int[] getLoser(String[] moves) {

		int [] status = {};
		return status;
	}
	
	public static int[] getWinner(String[] moves) {

	
      String mymoves [] =  moves;
		

		 
   			 while (mymoves < moves.length) {
   	 status = moves [p].equals("?");
   	
   	if (status) {
			p = p + 7;
			
		}else{
			break;
		}
   }
		

		
		
		return status;
	}

}
