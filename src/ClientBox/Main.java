package ClientBox;




import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 

//! this code is used for creating PhoneBook
public class Main extends Application
{ 
  public void start(Stage stage) throws Exception
	 { 
			 Parent root = FXMLLoader.load(getClass().getResource("ClientBox.fxml")); 
			

			 Scene scene = new Scene(root); 
			 stage.setTitle("ClientBox"); 
			 stage.setScene(scene); 
			 stage.show(); 
	 } 
  public static void main(String[] args)
	 	{ 
	  
      
        launch(args); 
		 	
		 	
		 	
	 	} 

}
