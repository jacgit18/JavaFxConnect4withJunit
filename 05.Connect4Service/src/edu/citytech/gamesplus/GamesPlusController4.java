package edu.citytech.gamesplus;

import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import edu.citytech.dao.WinningCombo;
import edu.citytech.dao.WinningComboDAO;
import edu.citytech.service.Connect4Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;

public class GamesPlusController4 implements Initializable {

	@FXML
	private GridPane fpGames2;
	
	@FXML
	private FlowPane fpGames3;


	@FXML
	private Label Title;

	@FXML
	private Label Name;

	@FXML
	private Label lbl_Message;

	@FXML
	private Button btn_Reset;
	
	@FXML
    void checkFloatOption(ActionEvent event) {

    }

	@Override
	public void initialize(URL url, ResourceBundle resource) {
		int i = 0;
		for (int rows = 0; rows <= 5; rows++) 
			for (int column = 0; column <= 6; column++) {
			Label label = new Label("?");
			labels[i] = label;
			label.getStyleClass().add("custom-label");
			label.setUserData(i);
			label.setOnMouseClicked((MouseEvent e) -> this.clickedEvent(e));
			fpGames2.add(label, column, rows);
			i++;

			}

	}
    private boolean isX = true;

	private void clickedEvent(MouseEvent e) {
		Label label = (Label)e.getSource();
		if(! label.getText().equals("?")){
			lbl_Message.setText("Invalid move as of " + new Date());
		
		return;
	}
	
	String xOrO = "";
	if (isX) {
		xOrO = "X";
	} else {
		xOrO = "O";
	}
	isX =!isX;
	label.setText(xOrO);
	
	String[] moves = new String[42];
	
	for (int i = 0; i < labels.length; i++) {
		moves[i] = labels[i].getText();
	}
	
	int cellNumber = (int) label.getUserData();
	String newMove = label.getText();
	moves[cellNumber] = "?";
	label.setText("?");
	
	int nextMove = Connect4Service.getValidCellMoves(moves, cellNumber);
	
	labels[nextMove].setText(newMove);
	labels[nextMove].getStyleClass().add(xOrO);
	
	lbl_Message.setText("Current is " + cellNumber + " next valid move is " + nextMove + " clicked on " + new Date());
		
	}
	
	private Label[] labels = new Label[42];
	
	@FXML
	void reset(ActionEvent event) {
		
		for (Label label : labels) {
			label.setText("?");
			label.getStyleClass().removeIf(e -> e.equals("X") || e.equals("O"));
		}
		isX = true;
		lbl_Message.setText("");
		
	}
	
	
}   
