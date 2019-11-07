package edu.citytech.gamesplus;

import edu.citytech.dao.WinningCombo;
import edu.citytech.dao.WinningComboDAO;
import edu.citytech.service.Connect4Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class GamesPlusController {

    @FXML
    private FlowPane fpGames;

    @FXML
    private HBox Row1;

    @FXML
    private Circle circ_1;

    @FXML
    private Circle circ_2;

    @FXML
    private Circle circ_3;

    @FXML
    private Circle circ_4;

    @FXML
    private Circle circ_5;

    @FXML
    private Circle circ_6;

    @FXML
    private HBox Row2;

    @FXML
    private Circle circ_7;

    @FXML
    private Circle circ_8;

    @FXML
    private Circle circ_9;

    @FXML
    private Circle circ_10;

    @FXML
    private Circle circ_11;

    @FXML
    private Circle circ_12;

    @FXML
    private HBox Row3;

    @FXML
    private Circle circ_13;

    @FXML
    private Circle circ_14;

    @FXML
    private Circle circ_15;

    @FXML
    private Circle circ_16;

    @FXML
    private Circle circ_17;

    @FXML
    private Circle circ_18;

    @FXML
    private HBox Row4;

    @FXML
    private Circle circ_19;

    @FXML
    private Circle circ_20;

    @FXML
    private Circle circ_21;

    @FXML
    private Circle circ_22;

    @FXML
    private Circle circ_23;

    @FXML
    private Circle circ_24;

    @FXML
    private HBox Row5;

    @FXML
    private Circle circ_25;

    @FXML
    private Circle circ_26;

    @FXML
    private Circle circ_27;

    @FXML
    private Circle circ_28;

    @FXML
    private Circle circ_29;

    @FXML
    private Circle circ_30;

    @FXML
    private HBox Row6;

    @FXML
    private Circle circ_31;

    @FXML
    private Circle circ_32;

    @FXML
    private Circle circ_33;

    @FXML
    private Circle circ_34;

    @FXML
    private Circle circ_35;

    @FXML
    private Circle circ_36;

    @FXML
    private Label Title;

    @FXML
    private Label Name;

    @FXML
    private Label lbl_Message;

    @FXML
    private Button btn_Reset;
    
	private boolean isX = false;


    @FXML
    void onMouseClicked(MouseEvent event) {
    	
    	Connect4Service win = new Connect4Service();
//    	win.
    	
    	
    	
    	// try to iterate to set values to 
//    	for (int i = 0; i < array.length; i++) {
			
//		}
    	
    	
    	
    	
    	
    	
    	
    	circ_1.setUserData("?");
    	circ_2.setUserData("?");
    	circ_3.setUserData("?");
    	circ_3.setUserData("?");
    	circ_4.setUserData("?");
    	circ_5.setUserData("?");
    	circ_6.setUserData("?");
    	circ_7.setUserData("?");
    	circ_8.setUserData("?");
    	circ_9.setUserData("?");
    	circ_10.setUserData("?");
    	circ_11.setUserData("?");
    	circ_12.setUserData("?");
    	circ_13.setUserData("?");
    	circ_14.setUserData("?");
    	circ_15.setUserData("?");
    	circ_16.setUserData("?");
    	circ_17.setUserData("?");
    	circ_18.setUserData("?");
    	circ_19.setUserData("?");
    	circ_20.setUserData("?");
    	circ_21.setUserData("?");
    	circ_22.setUserData("?");
    	circ_23.setUserData("?");
    	circ_24.setUserData("?");
    	circ_25.setUserData("?");
    	circ_26.setUserData("?");
    	circ_27.setUserData("?");
    	circ_28.setUserData("?");
    	circ_29.setUserData("?");
    	circ_30.setUserData("?");
    	circ_31.setUserData("?");
    	circ_32.setUserData("?");
    	circ_33.setUserData("?");
    	circ_33.setUserData("?");
    	circ_34.setUserData("?");
    	circ_35.setUserData("?");
    	circ_36.setUserData("?");
    	

    	
//    	Circle circ = (Circle) event.getSource();
//    	circ = new
//    	circ_1.getUserData();
//    	String getp1 = (String) circ_1.getUserData();
//    	Boolean setcolor =  circ_1.setFill(Color.WHITE);

    	
    	Circle circ = (Circle) event.getSource();
    	if (!circ.getUserData().equals("?")) {   
    		String value = "illegal";
    		lbl_Message.setText(value);
	 
    		return;
    	}
    	
    	//try testing colors
//    	String nextMove = isX ? "X":"O";
//    	circ.setUserData(nextMove);
//    	isX = !isX;
//    	
//    	
//    	 String p1,p2,p3;
//    	 p1 = circ1.getUserData();
    	 
//    	tostring 
//    	or String
    	

    	circ_1.setFill(Color.RED);
    	circ_2.setFill(Color.RED);
    	circ_3.setFill(Color.RED);
    	circ_4.setFill(Color.RED);
    	circ_5.setFill(Color.RED);
    	circ_6.setFill(Color.RED);
    	circ_7.setFill(Color.RED);
    	circ_8.setFill(Color.RED);
    	circ_9.setFill(Color.RED);
    	
    	circ_10.setFill(Color.RED);
    	circ_11.setFill(Color.RED);
    	circ_12.setFill(Color.RED);
    	circ_13.setFill(Color.RED);
    	circ_14.setFill(Color.RED);
    	circ_15.setFill(Color.RED);
    	circ_16.setFill(Color.RED);
    	circ_17.setFill(Color.RED);
    	circ_18.setFill(Color.RED);
    	
    	circ_19.setFill(Color.RED);
    	circ_20.setFill(Color.RED);
    	circ_21.setFill(Color.RED);
    	circ_22.setFill(Color.RED);
    	circ_23.setFill(Color.RED);
    	circ_24.setFill(Color.RED);
    	circ_25.setFill(Color.RED);
    	circ_26.setFill(Color.RED);
    	circ_27.setFill(Color.RED);
    	
    	circ_28.setFill(Color.RED);
    	circ_29.setFill(Color.RED);
    	circ_30.setFill(Color.RED);
    	circ_31.setFill(Color.RED);
    	circ_32.setFill(Color.RED);
    	circ_33.setFill(Color.RED);
    	circ_34.setFill(Color.RED);
    	circ_35.setFill(Color.RED);
    	circ_36.setFill(Color.RED);
    	
    	
    	
//    	circ_1.setFill(Color.YELLOW);
//    	circ_2.setFill(Color.YELLOW);
//    	circ_3.setFill(Color.YELLOW);
//    	circ_4.setFill(Color.YELLOW);
//    	circ_5.setFill(Color.YELLOW);
//    	circ_6.setFill(Color.YELLOW);
//    	circ_7.setFill(Color.YELLOW);
//    	circ_8.setFill(Color.YELLOW);
//    	circ_9.setFill(Color.YELLOW);
//    	
//    	circ_10.setFill(Color.YELLOW);
//    	circ_11.setFill(Color.YELLOW);
//    	circ_12.setFill(Color.YELLOW);
//    	circ_13.setFill(Color.YELLOW);
//    	circ_14.setFill(Color.YELLOW);
//    	circ_15.setFill(Color.YELLOW);
//    	circ_16.setFill(Color.YELLOW);
//    	circ_17.setFill(Color.YELLOW);
//    	circ_18.setFill(Color.YELLOW);
//    	
//    	circ_19.setFill(Color.YELLOW);
//    	circ_20.setFill(Color.YELLOW);
//    	circ_21.setFill(Color.YELLOW);
//    	circ_22.setFill(Color.YELLOW);
//    	circ_23.setFill(Color.YELLOW);
//    	circ_24.setFill(Color.YELLOW);
//    	circ_25.setFill(Color.YELLOW);
//    	circ_26.setFill(Color.YELLOW);
//    	circ_27.setFill(Color.YELLOW);
//    	
//    	circ_28.setFill(Color.YELLOW);
//    	circ_29.setFill(Color.YELLOW);
//    	circ_30.setFill(Color.YELLOW);
//    	circ_31.setFill(Color.YELLOW);
//    	circ_32.setFill(Color.YELLOW);
//    	circ_33.setFill(Color.YELLOW);
//    	circ_34.setFill(Color.YELLOW);
//    	circ_35.setFill(Color.YELLOW);
//    	circ_36.setFill(Color.YELLOW);
    	
    	
    	
		}

		

    @FXML
    void reset(ActionEvent event) {
    	
    	circ_1.setFill(Color.WHITE);
    	circ_2.setFill(Color.WHITE);
    	circ_3.setFill(Color.WHITE);
    	circ_4.setFill(Color.WHITE);
    	circ_5.setFill(Color.WHITE);
    	circ_6.setFill(Color.WHITE);
    	circ_7.setFill(Color.WHITE);
    	circ_8.setFill(Color.WHITE);
    	circ_9.setFill(Color.WHITE);
    	
    	circ_10.setFill(Color.WHITE);
    	circ_11.setFill(Color.WHITE);
    	circ_12.setFill(Color.WHITE);
    	circ_13.setFill(Color.WHITE);
    	circ_14.setFill(Color.WHITE);
    	circ_15.setFill(Color.WHITE);
    	circ_16.setFill(Color.WHITE);
    	circ_17.setFill(Color.WHITE);
    	circ_18.setFill(Color.WHITE);
    	
    	circ_19.setFill(Color.WHITE);
    	circ_20.setFill(Color.WHITE);
    	circ_21.setFill(Color.WHITE);
    	circ_22.setFill(Color.WHITE);
    	circ_23.setFill(Color.WHITE);
    	circ_24.setFill(Color.WHITE);
    	circ_25.setFill(Color.WHITE);
    	circ_26.setFill(Color.WHITE);
    	circ_27.setFill(Color.WHITE);
    	
    	circ_28.setFill(Color.WHITE);
    	circ_29.setFill(Color.WHITE);
    	circ_30.setFill(Color.WHITE);
    	circ_31.setFill(Color.WHITE);
    	circ_32.setFill(Color.WHITE);
    	circ_33.setFill(Color.WHITE);
    	circ_34.setFill(Color.WHITE);
    	circ_35.setFill(Color.WHITE);
    	circ_36.setFill(Color.WHITE);
			 
		 }
		

    

}
