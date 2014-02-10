package application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
//import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class CrewSec_CreateCardGUI{

	Scene registerScene;
	GridPane createCardGrid, attackHealthGrid, togbtnGrid;
	Group contentGroup = new Group();

	public CrewSec_CreateCardGUI(MasterGUI masterGUI) {
		contents(masterGUI);
	}

	public void contents(MasterGUI masterGUI){
		createCardGrid = new GridPane();
		createCardGrid.setAlignment(Pos.CENTER);
		createCardGrid.setHgap(10);
		createCardGrid.setVgap(10);
		createCardGrid.setPadding(new Insets(25, 25, 25, 25));
		
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
		createCardGrid.add(scenetitle, 0, 0, 2, 1);

		Label cardClasifikation = new Label("Klasifikation:");
		createCardGrid.add(cardClasifikation, 0, 1);
		
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
		createCardGrid.add(togbtnGrid, 1, 1);
		
		Label cardName = new Label("Kortnamn:");
		createCardGrid.add(cardName, 0, 2);

		TextField cardNameTextField = new TextField();
		createCardGrid.add(cardNameTextField, 1, 2);

		Label cost = new Label("Kostnad:");
		createCardGrid.add(cost, 0, 3);

		ComboBox<Integer> costList = new ComboBox<Integer>();
		costList.getItems().addAll(
				0,1,2,3,4,5,6,7,8,9,10
			);
		costList.setVisibleRowCount(11);
		createCardGrid.add(costList, 1, 3);
		
		Label type = new Label("Korttyp:");
		createCardGrid.add(type, 0, 4);

		//Ska hämta in de olika typerna från databasen
		ComboBox<String> cardTypeList = new ComboBox<String>();
		cardTypeList.getItems().addAll(
			    "Alv",
			    "Dvärg",
			    "Ork"
			);
		createCardGrid.add(cardTypeList, 1, 4);

		Label rarity = new Label("Ovanlighet:");
		createCardGrid.add(rarity, 0, 5);

		ComboBox<String> rarityList = new ComboBox<String>();
		rarityList.getItems().addAll(
			    "Vanlig",
			    "Sällsynt",
			    "Unik",
			    "Legend"
			);
		createCardGrid.add(rarityList, 1, 5);
		
		Label flavorTextLable = new Label("Utsmyckningstext:");
		createCardGrid.add(flavorTextLable, 0, 6);
		
		TextField flavorTextField = new TextField();
		createCardGrid.add(flavorTextField, 1, 6);
		
		//must be runned from a different place, not from "launch"-thread, investigate later.
//		Tooltip flavorTooltip = new Tooltip();
//		flavorTooltip.setText(
//		    "En kortfattad text som beskriver" + System.lineSeparator() +
//		    "kortet, gärna med en dråplig tvist."  + System.lineSeparator() +
//		    System.lineSeparator() + "Exempelvis:"  + System.lineSeparator() +
//		    "Det ryktas om att Atom sjukats av"  + System.lineSeparator() +
//		    "pantrar."  + System.lineSeparator() +
//		    "Antal gånger? Minst sjutton!"
//		);
//		flavorTextField.setTooltip(flavorTooltip);
		
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
		
		createCardGrid.add(attackHealthGrid, 1, 7);

		Label picturePath = new Label("Sökväg till bild:");
		createCardGrid.add(picturePath, 0, 8);

		TextField picturePathTextField = new TextField();
		createCardGrid.add(picturePathTextField, 1, 8);		

		Label abilityLable = new Label("Förmåga:");
		createCardGrid.add(abilityLable, 0, 9);
		
		ComboBox<String> abilityList = new ComboBox<String>();
		abilityList.getItems().addAll(
				"Ingen",
			    "Ledarskap", //ger alla +x/+x eller liknande, eller <typ>ledarskap +1 = exempelvis Alvisk ledarskap +1 ger alla andra vänliga alviska enheter +1/+1
			    "Köttmur", //motståndar enheter måste dräpa en köttmursenhet för att kunna attackera någon annan
			    "Initiativ", //får attackera direkt då den spelas
			    "Undvika anfall" //undviker den första direkta skadan mot enheten
			);
		createCardGrid.add(abilityList, 1, 9);

		Button btnRegister = new Button("Registrera");
		HBox hbBtnRegister = new HBox(10);
		hbBtnRegister.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtnRegister.getChildren().add(btnRegister);
		createCardGrid.add(hbBtnRegister, 1, 10);
		
		final Text actiontarget = new Text();
		createCardGrid.add(actiontarget, 1, 11);
		
		btnRegister.setOnAction(masterGUI);

		contentGroup.getChildren().addAll(createCardGrid);
	}

	public Group getGroup(){
		return contentGroup;
	}
}