package edu.asu.ASUHelloWorldJavaFXMaven;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class HelloFX extends Application {

    public void start(Stage primaryStage) {
    	System.out.println("Luke Perez Hello World!");
    	System.out.println("It started!");
        primaryStage.setTitle("In class Github activity");
        Button btn = new Button();
        btn.setText("Display: 'Luke Perez says: Hello World!'");
        btn.setOnAction(new EventHandler<>() {
            public void handle(ActionEvent event) {
                System.out.println("Luke Perez says: Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 400, 250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}