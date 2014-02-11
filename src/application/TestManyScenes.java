package application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TestManyScenes extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    TestClass2 tC2 = new TestClass2();

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Hello World");

        GridPane mainGrid = new GridPane();
		mainGrid.setAlignment(Pos.CENTER);
		mainGrid.setHgap(10);
		mainGrid.setVgap(10);
		mainGrid.setPadding(new Insets(25, 25, 25, 25));
        
        Group root1 = new Group();
        Group root2 = new Group();
        Group root3 = new Group();
        
        root3 = tC2.getGroup();
        mainGrid.add(root3, 0, 0);
        
        final Scene scene1 = new Scene(root1, 1000, 900);
        final Scene scene2 = new Scene(root2, 1000, 900);
        final Scene scene3 = new Scene(mainGrid, 1000, 900);


        Button go1 = new Button();
        go1.setLayoutX(100);
        go1.setLayoutY(80);
        go1.setText("Go  to scene2");
        go1.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene2);
            }
        });
        root1.getChildren().addAll(new Label("Scene 1"), go1);



        Button go2 = new Button();
        go2.setLayoutX(100);
        go2.setLayoutY(80);
        go2.setText("Go to scene3");
        go2.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
            	primaryStage.setScene(scene3);
            }
        });

        root2.getChildren().addAll(new TextField(), go2);



        Button go3 = new Button();
        go3.setLayoutX(100);
        go3.setLayoutY(80);
        go3.setText("Back to scene1");
        go3.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {
                primaryStage.setScene(scene1);
                
            }
        });

        root3.getChildren().addAll();
        
//        primaryStage.setFullScreen(true);
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}