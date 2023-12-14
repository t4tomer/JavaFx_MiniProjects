package MemoryQuize;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

//! this code is used for creating Memory Quize
public class Main extends Application {
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("controller1.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("MemoryQuize");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch(args);

    }

}