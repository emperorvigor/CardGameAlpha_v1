package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MasterGUI extends Application implements EventHandler<ActionEvent>{

	//creates a possible connection to other GUIs
	LoginGUI loginGUI;
	RegisterGUI regGUI;
	CrewSec_CreateCardGUI createCardGUI;

	//layout things
	GridPane mainGrid = new GridPane();
	Scene mainScene;
	Stage mStage;
	Scene scene1, scene2, scene3;

	Group grpLogIn, grpRegisterUser, grpCreateCard;

	//an empty constructor
	public MasterGUI (){
		loginGUI = new LoginGUI(this);
		regGUI = new RegisterGUI(this);
		createCardGUI = new CrewSec_CreateCardGUI(this);
	}

	@Override
	//this method handles all buttonpresses and their actions
	public void handle(ActionEvent event) {
		Button btn = (Button) event.getSource();
		String btnText = btn.getText();
		switch (btnText) {
		case "Registrera dig":
			mStage.setScene(scene3);
			mStage.setFullScreen(true);
			break;
		case "Logga in":
			break;
		case "Tillbaka":
			mStage.setScene(scene2);
			break;
			//         case 4:  monthString = "April";
			//                  break;
			//         case 5:  monthString = "May";
			//                  break;
			//         case 6:  monthString = "June";
			//                  break;
			//         case 7:  monthString = "July";
			//                  break;
			//         case 8:  monthString = "August";
			//                  break;
			//         case 9:  monthString = "September";
			//                  break;
			//         case 10: monthString = "October";
			//                  break;
			//         case 11: monthString = "November";
			//                  break;
			//         case 12: monthString = "December";
			//                  break;
		default: System.out.println("Invalid knapp");
		break;
		}
	}

	//starting method
	public static void initiate(String[] args) {
		launch(args);
	}

	//mainstage method which contains everything, including other classes GUI
	@Override
	public void start(Stage mainStage) throws Exception {

		//setting the mStage to mainStage so other outside-methods can use it
		mStage = mainStage;
		mStage.setTitle("Värdshuset Tabulan");

		//main grid
		mainGrid.setAlignment(Pos.CENTER);
		mainGrid.setHgap(10);
		mainGrid.setVgap(10);
		mainGrid.setPadding(new Insets(25, 25, 25, 25));

		//different groups used to switch layout-viewports
		Group grpLogIn = loginGUI.getGroup();
		Group grpRegisterUser = regGUI.getGroup();
		Group grpCreateCard = createCardGUI.getGroup();

		//scenes used to switch viewports
		scene1 = new Scene(grpCreateCard, 1000, 600);
		scene2 = new Scene(grpLogIn, 1000, 600);
		scene3 = new Scene(grpRegisterUser, 1000, 600);

		//		mainGrid.add(grpRegisterUser, 0, 0);
		//		mainGrid.add(grpLogIn, 0, 0);

		grpLogIn.getChildren().addAll();

		mStage.setScene(scene2);
//		mStage.setFullScreen(true);
		mStage.show();

	}
}