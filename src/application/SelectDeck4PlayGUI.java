package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SelectDeck4PlayGUI extends Application{

	Scene registerScene;
	GridPane select2PlayGrid;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Välj lek");

		primaryStage.setFullScreen(true);

		select2PlayGrid = new GridPane();
		select2PlayGrid.setAlignment(Pos.CENTER);
		select2PlayGrid.setHgap(10);
		select2PlayGrid.setVgap(10);
		select2PlayGrid.setPadding(new Insets(25, 25, 25, 25));

		ToggleButton tbtnLek1 = new ToggleButton();
		ToggleButton tbtnLek2 = new ToggleButton();
		ToggleButton tbtnLek3 = new ToggleButton();
		ToggleButton tbtnLek4 = new ToggleButton();
		ToggleButton tbtnLek5 = new ToggleButton();
		ToggleButton tbtnLek6 = new ToggleButton();
		ToggleButton tbtnLek7 = new ToggleButton();
		ToggleButton tbtnLek8 = new ToggleButton();
		ToggleButton tbtnLek9 = new ToggleButton();
		
		registerScene = new Scene(select2PlayGrid);
		primaryStage.setScene(registerScene);

		primaryStage.show();
	}

	public static void initiate(String[] args) {
		launch(args);
	}

	public GridPane getGrid(){
		return select2PlayGrid;
	}
}