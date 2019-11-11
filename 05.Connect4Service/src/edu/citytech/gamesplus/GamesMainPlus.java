package edu.citytech.gamesplus;
import java.net.URL;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GamesMainPlus extends Application {


	public static void main(String[] args) {
		Application.launch(GamesMainPlus.class, args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.
				 load(getClass().getResource("GamesPlus2.fxml"));
		
		stage.setTitle("Connect 4");
		Scene scene = new Scene(root); 
		stage.setScene(scene);
		stage.show();		

	
		URL url = getClass().getResource("GamesPlus2.css");
		if(url == null) {
			System.out.println("Resources not found Aborting");
			System.exit(-1);
		}
		
		
		
		String css = url .toExternalForm();
		scene.getStylesheets().add(css);
		

		
	}
	

}
