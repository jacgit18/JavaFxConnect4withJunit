package edu.citytech.gamesplus;

public class ValueHandler {
	private int position = 0;
	private boolean XorY= true;
//	private String[] getvalue = new String[42];
	
	
//	apply this logic
//	Paint fillColor = cir.getFill();
//	return fillColor == Color.WHITE ? "?" : fillColor == Color.RED ? "X" : "O";
	
	public ValueHandler(int position, boolean xorY) {
		super();
		this.position = position;
		this.XorY = xorY;
//		this.getvalue = getvalue;
	}
	
	


	public int getPosition() {
		return position;
	}


	public void setPosition(int position) {
		this.position = position;
	}


	public boolean isXorY() {
		return XorY;
	}


	public void setXorY(boolean xorY) {
		XorY = xorY;
	}


//	public String[] getGetvalue() {
//		return getvalue;
//	}
//
//
//	public void setGetvalue(String[] getvalue) {
//		this.getvalue = getvalue;
//	}
//	
	
}
