package Exam2022a71;

import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
public class Main extends Application
{ 
  public void start(Stage stage) throws Exception
	 { 
			Parent root = FXMLLoader.load(getClass().getResource("Exam2022a71.fxml")); //this Exam2021b98


			 Scene scene = new Scene(root); 
			 stage.setTitle("Exam2022a71 solution"); 
			 stage.setScene(scene); 
			 stage.show(); 
			 
			 
	 } 
  public static void main(String[] args)
	 	{ 
		 	launch(args); 
	 	} 
}