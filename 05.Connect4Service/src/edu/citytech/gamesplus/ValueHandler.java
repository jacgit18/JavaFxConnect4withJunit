package edu.citytech.gamesplus;

import javafx.scene.paint.Color;

public class ValueHandler {
	private int position = 0;
	private String XorY= "";
	private String YorX= "";

//	private String[] getvalue = new String[42];
	
	
//	apply this logic
//	Paint fillColor = cir.getFill();
//	return fillColor == Color.WHITE ? "?" : fillColor == Color.RED ? "X" : "O";
	
//	public ValueHandler(int position, String xorY) {
//		super();
//		this.position = position;
////		this.getvalue = getvalue;
//	}
	
//public ValueHandler(int position, String xorY) {
//	super();
//	this.position = position;
//	this.XorY = xorY;
//}

//	String XorO = "";
//	if (isX) {
//		XorO = "X";
//		circle.setUserData(XorO);
//		circle.setFill(Color.RED);
//
//	} else {
//		XorO = "O";
//		circle.setUserData(XorO);
//		circle.setFill(Color.YELLOW);
//
//	}
//	isX = !isX;


	public int getPosition() {
		return position;
	}


	
	public ValueHandler(int position, String xorY ) {
	super();
	this.position = position;
	this.XorY = xorY;
}

	public void setPosition(int position) {
		this.position = position;
	}


	public String getXorY() {
		return XorY;
	}

	public void setXorY(String xorY) {
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
