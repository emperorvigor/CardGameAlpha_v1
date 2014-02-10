package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class LoginGUI {
	
	MasterGUI mGUI;
	
	Group contentGroup = new Group();

	//constructor lets you send a MasterGUI object
	public LoginGUI(MasterGUI masterGUI) {
		contents(masterGUI);
		mGUI = masterGUI;
	}

	//contentmethod with everything layout-ish
	public void contents(MasterGUI masterGUI) {
		
		//main gridPane
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));

		//different fields with information or inputareas
		Text scenetitle = new Text("Välkommen till värdshuset Tabulan");
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
		
		//login button
		Button btnLogIn = new Button("Logga in");
		HBox hbBtnLogIn = new HBox(10);
		hbBtnLogIn.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnLogIn.getChildren().add(btnLogIn);
		grid.add(hbBtnLogIn, 1, 3);

//		final Text actiontarget = new Text();
//		grid.add(actiontarget, 1, 6);

		//lets MasterGUI handle the action performed by the login-button
		btnLogIn.setOnAction(masterGUI);

		Text txtRegister = new Text("Inte registrerad?");
		txtRegister.setFont(Font.font("Tahoma", FontWeight.NORMAL, 12));
		grid.add(txtRegister, 1, 4, 2, 1);

		//register button
		Button btnRegister = new Button("Registrera dig");
		HBox hbBtnRegister = new HBox(10);
		hbBtnRegister.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnRegister.getChildren().add(btnRegister);
		grid.add(hbBtnRegister, 1, 4);

		//lets MasterGUI handle the action
		btnRegister.setOnAction(masterGUI);
		
		contentGroup.getChildren().addAll(grid);

	}

	//lets MasterGUI get its hands on the content
	public Group getGroup(){
		return contentGroup;
	}
}
