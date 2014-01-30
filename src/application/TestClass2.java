package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class TestClass2 {

		public TestClass2(){
			contents();
		}
		Group contentGroup = new Group();
		
		public void contents(){
			GridPane registerGrid = new GridPane();
			registerGrid.setAlignment(Pos.CENTER);
			registerGrid.setHgap(10);
			registerGrid.setVgap(10);
			registerGrid.setPadding(new Insets(25, 25, 25, 25));

			Text scenetitle = new Text("Registrera dig");
			scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
			registerGrid.add(scenetitle, 0, 0, 2, 1);

			Label userName = new Label("Användarnamn:");
			registerGrid.add(userName, 0, 1);

			TextField userTextField = new TextField();
			registerGrid.add(userTextField, 1, 1);

			Label pw = new Label("Lösenord:");
			registerGrid.add(pw, 0, 2);

			PasswordField pwBox = new PasswordField();
			registerGrid.add(pwBox, 1, 2);
			
			Label pwRepeat = new Label("Repetera lösenord:");
			registerGrid.add(pwRepeat, 0, 3);

			PasswordField pwRepeatBox = new PasswordField();
			registerGrid.add(pwRepeatBox, 1, 3);
			
			Label userEmail = new Label("Alias:");
			registerGrid.add(userEmail, 0, 4);

			TextField userEmailTextField = new TextField();
			registerGrid.add(userEmailTextField, 1, 4);		

			Label userRealName = new Label("Förnamn:");
			registerGrid.add(userRealName, 0, 5);

			TextField userRealNameTextField = new TextField();
			registerGrid.add(userRealNameTextField, 1, 5);
			
			Label userSureName = new Label("Efternamn:");
			registerGrid.add(userSureName, 0, 6);

			TextField userSureNameTextField = new TextField();
			registerGrid.add(userSureNameTextField, 1, 6);

			final Text actiontarget = new Text();
			registerGrid.add(actiontarget, 1, 8);

			Button btnRegister = new Button("Registrera");
			HBox hbBtnRegister = new HBox(10);
			hbBtnRegister.setAlignment(Pos.BOTTOM_RIGHT);
			hbBtnRegister.getChildren().add(btnRegister);
			registerGrid.add(hbBtnRegister, 1, 7);

			btnRegister.setOnAction(new EventHandler<ActionEvent>() {

				public void handle(ActionEvent e) {
					actiontarget.setFill(Color.FIREBRICK);
					actiontarget.setText("Register button pressed");
				}
			});

			contentGroup.getChildren().addAll(registerGrid);
		}
		
		public Group getGroup(){
			return contentGroup;
		}
}
