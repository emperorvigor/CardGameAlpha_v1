//------------------- Sparar gammal kod
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//public class RegisterGUI extends Application{

	Scene registerScene;
	GridPane registerGrid;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Tavernan");

		primaryStage.setFullScreen(true);

		registerGrid = new GridPane();
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

		registerScene = new Scene(registerGrid);
		primaryStage.setScene(registerScene);

		primaryStage.show();
	}

	public static void initiate(String[] args) {
		launch(args);
	}

	public GridPane getGrid(){
		return registerGrid;
	}
}

//------------------- LogIn gammal kod

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
	
	MasterGUI mGUI;
	
	public LoginGUI(MasterGUI masterGUI) {
		// TODO Auto-generated constructor stub
		mGUI = masterGUI;
	}

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

//		btnRegister.setOnAction(mGUI);

		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	public static void initiate(String[] args) {
		launch(args);
	}
}

package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CrewSec_CreateCardGUI extends Application{

	Scene registerScene;
	GridPane crewSec_CreateCard, attackHealthGrid, togbtnGrid;
	
	@Override
	public void start(final Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("CrewSec™");

		primaryStage.setFullScreen(true);

		crewSec_CreateCard = new GridPane();
		crewSec_CreateCard.setAlignment(Pos.CENTER);
		crewSec_CreateCard.setHgap(10);
		crewSec_CreateCard.setVgap(10);
		crewSec_CreateCard.setPadding(new Insets(25, 25, 25, 25));
		
		attackHealthGrid = new GridPane();
		attackHealthGrid.setAlignment(Pos.CENTER);
		attackHealthGrid.setHgap(10);
		attackHealthGrid.setVgap(10);
		attackHealthGrid.setPadding(new Insets(0, 0, 0, 0));
		
		togbtnGrid = new GridPane();
		togbtnGrid.setAlignment(Pos.BASELINE_CENTER);
		togbtnGrid.setHgap(10);
		togbtnGrid.setVgap(10);
		togbtnGrid.setPadding(new Insets(0, 0, 0, 0));
		
		Text scenetitle = new Text("CrewSec™ - Skapa kort");
		scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		crewSec_CreateCard.add(scenetitle, 0, 0, 2, 1);

		Label cardClasifikation = new Label("Klasifikation:");
		crewSec_CreateCard.add(cardClasifikation, 0, 1);
		
		ToggleGroup rbGroup = new ToggleGroup();
		RadioButton rbtnBuilding = new RadioButton("Byggnad");
		rbtnBuilding.setToggleGroup(rbGroup);
		RadioButton rbtnEffect = new RadioButton("Effekt");
		rbtnEffect.setToggleGroup(rbGroup);
		RadioButton rbtnUnit = new RadioButton("Enhet");
		rbtnUnit.setToggleGroup(rbGroup);
		
		rbtnBuilding.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		        System.out.println("asgin");
		    }
		});
		
		togbtnGrid.add(rbtnBuilding, 0, 0);
		togbtnGrid.add(rbtnEffect, 1, 0);
		togbtnGrid.add(rbtnUnit, 2, 0);
		crewSec_CreateCard.add(togbtnGrid, 1, 1);
		
		Label cardName = new Label("Kortnamn:");
		crewSec_CreateCard.add(cardName, 0, 2);

		TextField cardNameTextField = new TextField();
		crewSec_CreateCard.add(cardNameTextField, 1, 2);

		Label cost = new Label("Kostnad:");
		crewSec_CreateCard.add(cost, 0, 3);

		ComboBox<Integer> costList = new ComboBox<Integer>();
		costList.getItems().addAll(
				0,1,2,3,4,5,6,7,8,9,10
			);
		costList.setVisibleRowCount(11);
		crewSec_CreateCard.add(costList, 1, 3);
		
		Label type = new Label("Korttyp:");
		crewSec_CreateCard.add(type, 0, 4);

		//Ska hämta in de olika typerna från databasen
		ComboBox<String> cardTypeList = new ComboBox<String>();
		cardTypeList.getItems().addAll(
			    "Alv",
			    "Dvärg",
			    "Ork"
			);
		crewSec_CreateCard.add(cardTypeList, 1, 4);

		Label rarity = new Label("Ovanlighet:");
		crewSec_CreateCard.add(rarity, 0, 5);

		ComboBox<String> rarityList = new ComboBox<String>();
		rarityList.getItems().addAll(
			    "Vanlig",
			    "Sällsynt",
			    "Unik",
			    "Legend"
			);
		crewSec_CreateCard.add(rarityList, 1, 5);
		
		Label flavorTextLable = new Label("Utsmyckningstext:");
		crewSec_CreateCard.add(flavorTextLable, 0, 6);
		
		final TextField flavorTextField = new TextField();
		crewSec_CreateCard.add(flavorTextField, 1, 6);
		
		final Tooltip flavorTooltip = new Tooltip();
		flavorTooltip.setText(
		    "En kortfattad text som beskriver" + System.lineSeparator() +
		    "kortet, gärna med en dråplig tvist."  + System.lineSeparator() +
		    System.lineSeparator() + "Exempelvis:"  + System.lineSeparator() +
		    "Det ryktas om att Atom sjukats av"  + System.lineSeparator() +
		    "pantrar."  + System.lineSeparator() +
		    "Antal gånger? Minst sjutton!"
		);
		flavorTextField.setTooltip(flavorTooltip);
		
		//------- Det nedan är ett experiment för att få ett "permanent" tooltip
		//------- så längen man håller musen inne i "flavorTextField"
//	    flavorTextField.setOnMouseEntered(new EventHandler<MouseEvent>() {  
//	      
//	        @Override  
//	        public void handle(MouseEvent event) {  
//	        	Node  node =(Node)event.getSource();
//	            flavorTooltip.show(node, FxApp.stage.getX()+event.getSceneX(), FxApp.stage.getY()+event.getSceneY());
//	        }  
//	    });  
//	    flavorTextField.setOnMouseExited(new EventHandler<MouseEvent>() {  
//	      
//	        @Override  
//	        public void handle(MouseEvent event) {  
//	            flavorTooltip.hide();  
//	        }  
//	    });  
		//--------- Experiment slut -----------
		
		Label attackLable = new Label("Attack:");
		attackHealthGrid.add(attackLable, 0, 1);

		ComboBox<Integer> attackList = new ComboBox<Integer>();
		attackList.getItems().addAll(
			    0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
			);
		costList.setVisibleRowCount(11);
		attackHealthGrid.add(attackList, 1, 1);
		
		Label healthLable = new Label("Hälsa:");
		attackHealthGrid.add(healthLable, 2, 1);
		
		ComboBox<Integer> healthList = new ComboBox<Integer>();
		healthList.getItems().addAll(
			    0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
			);
		costList.setVisibleRowCount(11);
		attackHealthGrid.add(healthList, 3, 1);
		
		crewSec_CreateCard.add(attackHealthGrid, 1, 7);

		Label picturePath = new Label("Sökväg till bild:");
		crewSec_CreateCard.add(picturePath, 0, 8);

		TextField picturePathTextField = new TextField();
		crewSec_CreateCard.add(picturePathTextField, 1, 8);		

		Label abilityLable = new Label("Förmåga:");
		crewSec_CreateCard.add(abilityLable, 0, 9);
		
		ComboBox<String> abilityList = new ComboBox<String>();
		abilityList.getItems().addAll(
				"Ingen",
			    "Ledarskap", //ger alla +x/+x eller liknande, eller <typ>ledarskap +1 = exempelvis Alvisk ledarskap +1 ger alla andra vänliga alviska enheter +1/+1
			    "Köttmur", //motståndar enheter måste dräpa en köttmursenhet för att kunna attackera någon annan
			    "Initiativ", //får attackera direkt då den spelas
			    "Undvika anfall" //undviker den första direkta skadan mot enheten
			);
		crewSec_CreateCard.add(abilityList, 1, 9);

		Button btnRegister = new Button("Registrera");
		HBox hbBtnRegister = new HBox(10);
		hbBtnRegister.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnRegister.getChildren().add(btnRegister);
		crewSec_CreateCard.add(hbBtnRegister, 1, 10);
		
		final Text actiontarget = new Text();
		crewSec_CreateCard.add(actiontarget, 1, 11);
		
		btnRegister.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				actiontarget.setFill(Color.FIREBRICK);
				actiontarget.setText("Register button pressed");
				RegisterGUI rgui = new RegisterGUI();
				GridPane gp = new GridPane();
				gp = rgui.getGrid();
				Scene st1 = new Scene(gp);
				primaryStage.setScene(st1);
			}
		});

		registerScene = new Scene(crewSec_CreateCard);
		primaryStage.setScene(registerScene);

		primaryStage.show();
	}

	public static void initiate(String[] args) {
		launch(args);
	}

	public GridPane getGrid(){
		return crewSec_CreateCard;
	}
}