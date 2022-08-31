package Exam2022a82;


import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
public class Main extends Application
{ 
  public void start(Stage stage) throws Exception
	 { 
			Parent root = FXMLLoader.load(getClass().getResource("Exam2022a82.fxml")); //this Exam2022a82

			// but21.setStyle("-fx-background-color: white");

			 Scene scene = new Scene(root); 
			 stage.setTitle("Exam2022a82 solution"); 
			 stage.setScene(scene); 
			 stage.show(); 
			 
			 
	 } 
  public static void main(String[] args)
	 	{ 
		 	launch(args); 
	 	} 
}