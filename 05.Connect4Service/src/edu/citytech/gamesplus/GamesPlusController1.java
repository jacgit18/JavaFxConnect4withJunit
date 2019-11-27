package edu.citytech.gamesplus;

import java.util.List;

import edu.citytech.service.Connect4Service;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class GamesPlusController1 {

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

	private boolean isRed = false;

    
    
    @FXML
    void onMouseClicked(MouseEvent event) {
    	Circle circle = (Circle) event.getSource();

		if (circle.getFill() != Color.WHITE) {
			lbl_Message.setText("This is not your turn!");
			return;
		}

		// GET ALL CHILDREN HERE.
		List<Node> nodes = fpGames.getChildren();

		// MAP X OR O TO COLOR.
		String[] rawMoves = nodes.stream().map(x -> {
			Circle cir = (Circle) x;
			Paint fillColor = cir.getFill();
			return fillColor == Color.WHITE ? "?" : fillColor == Color.RED ? "X" : "O";
		}).toArray(String[]::new);
		
		int id = Integer.parseInt(circle.getId().replace("circ_", ""));
		int validMove = Connect4Service.getValidCellMoves(rawMoves, id);

		Circle validCircle = (Circle) nodes.get(validMove);
		Color color = isRed ? Color.RED : Color.YELLOW;
		
		validCircle.setFill(color);
		validCircle.setDisable(true);
		isRed = !isRed;

		int[] winnerMoves = Connect4Service.getWinner(rawMoves);
		if (winnerMoves.length != 0) {
			lbl_Message.setText("You are the winner!");
			fpGames.getChildren().forEach(x -> {
				Circle cir = (Circle) x;
				cir.setDisable(true);
			});
		}
	}
    @FXML
    void reset(ActionEvent event) {
    	fpGames.getChildren().forEach(x -> {
			Circle circle = (Circle) x;

			if (circle.isDisabled())
				circle.setDisable(false);
			circle.setFill(Color.WHITE);
		});

    	lbl_Message.setText("");

    }

}
