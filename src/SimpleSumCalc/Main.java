package SimpleSumCalc;

import java.io.*;



import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 

public class Main extends Application
{ 
  public void start(Stage stage) throws Exception
	 { 
			 Parent root = FXMLLoader.load(getClass().getResource("SimpleSumCalc.fxml")); // this is simple calulater from exam 
			 Scene scene = new Scene(root); 
			 stage.setTitle("MathDemo"); 
			 stage.setScene(scene); 
			 stage.show(); 
			 
	 } 
  public static void main(String[] args)
	 	{ 

      
      launch(args); 
		 	
		 	
		 	
	 	} 

}