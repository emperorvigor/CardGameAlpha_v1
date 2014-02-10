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

public class RegisterGUI {

	//contentGroup will be fetched by the "getContent"-method
	Group contentGroup = new Group();

	//inputs a MasterGUI object for reference
	public RegisterGUI(MasterGUI masterGUI){
		contents(masterGUI);
	}

	//within this method, the layout is created. MasterGUI works as a reference
	public void contents(MasterGUI masterGUI){
		//the main grid, the actual layoutholder
		GridPane registerGrid = new GridPane();
		registerGrid.setAlignment(Pos.CENTER);
		registerGrid.setHgap(10);
		registerGrid.setVgap(10);
		registerGrid.setPadding(new Insets(25, 25, 25, 25));

		//titlename
		Text scenetitle = new Text("Registrera dig");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		registerGrid.add(scenetitle, 0, 0, 2, 1);

		//lablename for usernameinput
		Label userName = new Label("Användarnamn:");
		registerGrid.add(userName, 0, 1);

		TextField userTextField = new TextField();
		registerGrid.add(userTextField, 1, 1);

		//passwordfield with lable
		Label pw = new Label("Lösenord:");
		registerGrid.add(pw, 0, 2);

		PasswordField pwBox = new PasswordField();
		registerGrid.add(pwBox, 1, 2);

		//a password-repeatfunction so that the pw acutaly is correct
		Label pwRepeat = new Label("Repetera lösenord:");
		registerGrid.add(pwRepeat, 0, 3);

		PasswordField pwRepeatBox = new PasswordField();
		registerGrid.add(pwRepeatBox, 1, 3);

		//alias, this name will be seen by other players
		Label userAlias = new Label("Alias:");
		registerGrid.add(userAlias, 0, 4);

		TextField userAliasTextField = new TextField();
		registerGrid.add(userAliasTextField, 1, 4);		

		//realname submitionareas
		Label userFirstName = new Label("Förnamn:");
		registerGrid.add(userFirstName, 0, 5);

		TextField userFirstNameTextField = new TextField();
		registerGrid.add(userFirstNameTextField, 1, 5);

		Label userSureName = new Label("Efternamn:");
		registerGrid.add(userSureName, 0, 6);

		TextField userSureNameTextField = new TextField();
		registerGrid.add(userSureNameTextField, 1, 6);

//		final Text actiontarget = new Text();
//		registerGrid.add(actiontarget, 1, 8);

		//back-button
		Button btnBack = new Button("Tillbaka");
		HBox hbBtnBack = new HBox(10);
		hbBtnBack.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnBack.getChildren().add(btnBack);
		registerGrid.add(hbBtnBack, 0, 7);
		
		//will let MasterGUI handle the action
		btnBack.setOnAction(masterGUI);
		
		//register button
		Button btnRegister = new Button("Registrera");
		HBox hbBtnRegister = new HBox(10);
		hbBtnRegister.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnRegister.getChildren().add(btnRegister);
		registerGrid.add(hbBtnRegister, 1, 7);

		//will let MasterGUI handle the action
		btnRegister.setOnAction(masterGUI);

		//?????
		contentGroup.getChildren().addAll(registerGrid);
	}

	//returns the content for MasterGUI to use
	public Group getGroup(){
		return contentGroup;
	}
}