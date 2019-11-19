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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;

public class GamesPlusController implements Initializable {

	@FXML
	private GridPane fpGames2;

	@FXML
	private Label Title;

	@FXML
	private Label Name;

	@FXML
	private Label lbl_Message;

	@FXML
	private Button btn_Reset;
	


	@Override
	public void initialize(URL url, ResourceBundle resource) {
		int i = 0;
		for (int Rows = 0; Rows <= 5; Rows++)
			for (int Coulmn = 0; Coulmn <= 6; Coulmn++) {
				Circle circle = new Circle();

				circle.setCenterX(100.0f);
				circle.setCenterY(100.0f);
				circle.setRadius(45.0f);
				circle.setFill(Color.WHITE);
				circle.setStroke(Color.rgb(18, 97, 183));
				circle.setStrokeWidth(5);
				circle.setStrokeType(StrokeType.OUTSIDE);
				circle.setStrokeLineCap(StrokeLineCap.ROUND);
				circle.setStrokeLineJoin(StrokeLineJoin.ROUND);
				circle.setStrokeMiterLimit(10);
				circle.setStrokeDashOffset(0);
				circles[i] = circle;

				circle.setUserData(i);// problems // come back figure out gravity
				circle.setOnMouseClicked((MouseEvent e) -> this.clickedEvent(e));
				fpGames2.add(circle, Coulmn, Rows);
				i++;

			}

	}

	private boolean isX = true;

	private void clickedEvent(MouseEvent e) {
		Circle circle = (Circle) e.getSource();
		String[] moves = new String[42];//

//		if (!circle.getUserData().equals("?")) {
//			lbl_Message.setText("Invalid Move: " + new Date());
//		}
		
		if (circle.getFill() != Color.WHITE) {
			lbl_Message.setText("Not your turn");
			return;
		}
		
	
		

		
		
		
		
		System.out.println(circle.getUserData());
		int cellNumber = Integer.parseInt( String.valueOf( circle.getUserData())); // problem
//     	Data d  = new Data (d.index, d.XorO);
		

		String XorO = "";
		if (isX) {
			XorO = "X";
			circle.setUserData(XorO);
			circle.setFill(Color.RED);

		} else {
			XorO = "O";
			circle.setUserData(XorO);
			circle.setFill(Color.YELLOW);

		}
		isX = !isX;
		circle.setUserData(XorO);

		for (int i = 0; i < circles.length; i++) {
			moves[i] = String.valueOf(circles[i].getUserData());
		}

		String newMove = (String) circle.getUserData(); //
		moves[cellNumber] = "?";
		circle.setUserData("?");


		int nextMove = Connect4Service.getValidCellMoves(moves, cellNumber);

		circles[nextMove].setUserData(newMove);
		circles[nextMove].getStyleClass().add(XorO);

		lbl_Message
				.setText("Current index " + cellNumber + " next valid move is " + nextMove + " Clicked on" + new Date());
//    	lbl_Message.setText("Clicked on" + new Date());

	}
	
	

	private Circle[] circles = new Circle[42];

	@FXML
	void reset(ActionEvent event) {

		for (Circle circle : circles) {

			circle.setFill(Color.WHITE);

			circle.getStyleClass().removeIf(e -> e.equals("X") || e.equals("O"));
		}
		isX = true;
		lbl_Message.setText(" ");

	}

}
