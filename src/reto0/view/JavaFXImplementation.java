/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto0.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Miguel Sanchez
 */
/**
 * 
 * This is the class used to view the message in JavaFX implementation
 */
public class JavaFXImplementation extends Application implements View{
    private static String saludo="";
    @Override
    public void start(Stage primaryStage) {
        Label lb=new Label(saludo);
        StackPane root = new StackPane();
        root.getChildren().add(lb);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     *
     * @param greeting
     * this method shows the greeting into java fx window
     */
    @Override
    public void showGreeting(String greeting) {
        saludo=greeting;
        launch(new String[1]);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
