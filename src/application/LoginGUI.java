package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class LoginGUI extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Tabulan");

		primaryStage.setFullScreen(true);

		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		Text scenetitle = new Text("Välkommen till Tavernan");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		grid.add(scenetitle, 0, 0, 2, 1);

		Label userName = new Label("Användarnamn:");
		grid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		grid.add(userTextField, 1, 1);

		Label pw = new Label("Lösenord:");
		grid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		grid.add(pwBox, 1, 2);

		Button btnLogIn = new Button("Logga in");
		HBox hbBtnLogIn = new HBox(10);
		hbBtnLogIn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnLogIn.getChildren().add(btnLogIn);
		grid.add(hbBtnLogIn, 1, 3);

		final Text actiontarget = new Text();
		grid.add(actiontarget, 1, 6);

		btnLogIn.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				actiontarget.setFill(Color.FIREBRICK);
				actiontarget.setText("Sign in button pressed");
			}
		});

		Text txtRegister = new Text("Inte registrerad?");
		txtRegister.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
		grid.add(txtRegister, 1, 4, 2, 1);

		Button btnRegister = new Button("Registrera dig");
		HBox hbBtnRegister = new HBox(10);
		hbBtnRegister.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnRegister.getChildren().add(btnRegister);
		grid.add(hbBtnRegister, 1, 4);

		btnRegister.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				actiontarget.setFill(Color.FIREBRICK);
				actiontarget.setText("Register button pressed");
			}
		});

		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void initiate(String[] args) {
		launch(args);
	}
}
