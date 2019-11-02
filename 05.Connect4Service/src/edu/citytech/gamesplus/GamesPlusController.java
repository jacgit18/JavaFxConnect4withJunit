package edu.citytech.gamesplus;

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
    	
    	//circ_1.setFill(Color.BLUE);
    	//circ_2.setFill(Color.BLUE);
    	//circ_3.setFill(Color.BLUE);
    	//circ_4.setFill(Color.BLUE);
    	//circ_5.setFill(Color.BLUE);
    	//circ_6.setFill(Color.BLUE);
    	//circ_7.setFill(Color.BLUE);
    	//circ_8.setFill(Color.BLUE);
    	//circ_9.setFill(Color.BLUE);
    	//
    	//circ_10.setFill(Color.BLUE);
    	//circ_11.setFill(Color.BLUE);
    	//circ_12.setFill(Color.BLUE);
    	//circ_13.setFill(Color.BLUE);
    	//circ_14.setFill(Color.BLUE);
    	//circ_15.setFill(Color.BLUE);
    	//circ_16.setFill(Color.BLUE);
    	//circ_17.setFill(Color.BLUE);
    	//circ_18.setFill(Color.BLUE);
    	//
    	//circ_19.setFill(Color.BLUE);
    	//circ_20.setFill(Color.BLUE);
    	//circ_21.setFill(Color.BLUE);
    	//circ_22.setFill(Color.BLUE);
    	//circ_23.setFill(Color.BLUE);
    	//circ_24.setFill(Color.BLUE);
    	//circ_25.setFill(Color.BLUE);
    	//circ_26.setFill(Color.BLUE);
    	//circ_27.setFill(Color.BLUE);
    	//
    	//circ_28.setFill(Color.BLUE);
    	//circ_29.setFill(Color.BLUE);
    	//circ_30.setFill(Color.BLUE);
    	//circ_31.setFill(Color.BLUE);
    	//circ_32.setFill(Color.BLUE);
    	//circ_33.setFill(Color.BLUE);
    	//circ_34.setFill(Color.BLUE);
    	//circ_35.setFill(Color.BLUE);
    	//circ_36.setFill(Color.BLUE);
    	
    	
    	
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
