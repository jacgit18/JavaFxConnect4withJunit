package edu.citytech.gamesplus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;

public class GamesPlusController {

    @FXML
    private FlowPane fpGames;

    @FXML
    private Label lbl_1;

    @FXML
    private Label lbl_2;

    @FXML
    private Label lbl_3;

    @FXML
    private Label lbl_4;

    @FXML
    private Label lbl_5;

    @FXML
    private Label lbl_6;

    @FXML
    private Label lbl_7;

    @FXML
    private Label lbl_8;

    @FXML
    private Label lbl_9;

    @FXML
    private Label lbl_10;

    @FXML
    private Label lbl_11;

    @FXML
    private Label lbl_12;

    @FXML
    private Label lbl_13;

    @FXML
    private Label lbl_14;

    @FXML
    private Label lbl_15;

    @FXML
    private Label lbl_16;

    @FXML
    private Label lbl_17;

    @FXML
    private Label lbl_18;

    @FXML
    private Label lbl_19;

    @FXML
    private Label lbl_20;

    @FXML
    private Label lbl_21;

    @FXML
    private Label lbl_22;

    @FXML
    private Label lbl_23;

    @FXML
    private Label lbl_24;

    @FXML
    private Label lbl_25;

    @FXML
    private Label lbl_26;

    @FXML
    private Label lbl_27;

    @FXML
    private Label lbl_28;

    @FXML
    private Label lbl_29;

    @FXML
    private Label lbl_30;

    @FXML
    private Label lbl_31;

    @FXML
    private Label lbl_32;

    @FXML
    private Label lbl_33;

    @FXML
    private Label lbl_34;

    @FXML
    private Label lbl_35;

    @FXML
    private Label lbl_36;

    @FXML
    private Button btnReset;

    @FXML
    private Label lblMessage;
    
	private boolean isX = false;


    @FXML
    void onMouseClicked(MouseEvent event) {
    	
    	Label label = (Label) event.getSource();
		if (!label.getText().equals("?")) {
			String value = "illegal move";
			lblMessage.setText(value);

			return;
		}

		String nextMove = isX ? "X" : "O";
		label.setText(nextMove);
		isX = !isX;

		String p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,p11;
		p1 = lbl_1.getText();
		p2 = lbl_2.getText();
		p3 = lbl_3.getText();
		p4 = lbl_4.getText();
		p5 = lbl_5.getText();
		p6 = lbl_6.getText();
		p7 = lbl_7.getText();
		p8 = lbl_8.getText();
		p9 = lbl_9.getText();
		p1 = lbl_1.getText();
		p2 = lbl_2.getText();
		p3 = lbl_3.getText();
		p4 = lbl_4.getText();
		p5 = lbl_5.getText();
		p6 = lbl_6.getText();
		p7 = lbl_7.getText();
		p8 = lbl_8.getText();
		p9 = lbl_9.getText();
		p1 = lbl_1.getText();
		p2 = lbl_2.getText();
		p3 = lbl_3.getText();
		p4 = lbl_4.getText();
		p5 = lbl_5.getText();
		p6 = lbl_6.getText();
		p7 = lbl_7.getText();
		p8 = lbl_8.getText();
		p9 = lbl_9.getText();
		p1 = lbl_1.getText();
		p2 = lbl_2.getText();
		p3 = lbl_3.getText();
		p4 = lbl_4.getText();
		p5 = lbl_5.getText();
		p6 = lbl_6.getText();
		p7 = lbl_7.getText();
		p8 = lbl_8.getText();
		p9 = lbl_9.getText();

    
    	
    	// try multi-dimensional array buttom will be filled first
    			 int p = 0;
    			 String [] [] moves = new String[6] [6]; // grid is 6 by 6
    			 String []moves1 = new String[41]; // ranges from 1 to 41 but index would be 0 to 40

    			 
    			 while (p < moves.length) {
    	boolean status = moves [p].equals("p");
    	
    	if (status) {
			p = p + 7;
		}else{
			break;
		}

    }
}

    @FXML
    void reset(ActionEvent event) {
    	lbl_1.setText("?");
		lbl_2.setText("?");
		lbl_3.setText("?");
		lbl_4.setText("?");
		lbl_5.setText("?");
		lbl_6.setText("?");
		lbl_7.setText("?");
		lbl_8.setText("?");
		lbl_9.setText("?");
		lbl_10.setText("?");
		lbl_11.setText("?");
		lbl_12.setText("?");
		lbl_13.setText("?");
		lbl_14.setText("?");
		lbl_15.setText("?");
		lbl_16.setText("?");
		lbl_17.setText("?");
		lbl_18.setText("?");
		lbl_19.setText("?");
		lbl_20.setText("?");
		lbl_21.setText("?");
		lbl_22.setText("?");
		lbl_23.setText("?");
		lbl_24.setText("?");
		lbl_25.setText("?");
		lbl_26.setText("?");
		lbl_27.setText("?");
		lbl_28.setText("?");
		lbl_29.setText("?");
		lbl_30.setText("?");
		lbl_31.setText("?");
		lbl_32.setText("?");
		lbl_33.setText("?");
		lbl_34.setText("?");
		lbl_35.setText("?");
		lbl_36.setText("?");
		lblMessage.setText("");

   
			 
		 }
		

    

}
