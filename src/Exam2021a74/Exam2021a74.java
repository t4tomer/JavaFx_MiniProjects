package Exam2021a74;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.AnchorPane;




public class Exam2021a74 {

	int counter=0;
    boolean flag=false;
	Button num_pressed; //the id of the butten that pressed
    int i;int j;

    // public Exam2021a74() {AnchorPane.setStyle("-fx-background-color: green");}

    @FXML
    private Button but11;

    @FXML
    private Button but12;

    @FXML
    private Button but13;

    @FXML
    private Button but21;

    @FXML
    private Button but22;

    @FXML
    private Button but23;

    @FXML
    private Button but31;

    @FXML
    private Button but32;

    @FXML
    private Button but33;

    @FXML
    private Button clear;

    @FXML
    private GridPane GridPane;
    @FXML
    private AnchorPane AnchorPane;

    @FXML
    void but11_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but11);   	   	
    }

    @FXML
    void but12_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but12);
    }

    @FXML
    void but13_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but13);
    }

    @FXML
    void but21_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but21);
    }

    @FXML
    void but22_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but22);
    }

    @FXML
    void but23_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but23);
    }

    @FXML
    void but31_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but31);
    }

    @FXML
    void but32_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but32);
    }

    @FXML
    void but33_pressed(ActionEvent event) {
    	counter++;
    	control_cell(counter,but33);
    }
       
    
    @FXML
    void clear_pressed(ActionEvent event) {
        AnchorPane.setStyle("-fx-background-color: green");
        GridPane.getChildren().clear();//clear the gridpane        
        clear(); //clear buttens
        for(i=0;i<3;i++)
            for( j=0;j<3; j++)
            {
                Button b=new Button();
                b.setStyle("-fx-background-color: white");//set butten to white collor
                GridPane.add(b, i, j);//add new button to gridpane
                EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() // what happnes when you press a button 
                {
                    public void handle(ActionEvent event1)
                    {
                        counter++;
                        flag=!flag;
                        if(flag)
                            b.setStyle("-fx-background-color: white; ");// set button white
                        else
                            b.setStyle("-fx-background-color: black"); // set button black
                    }                                  
                }; 
                b.setOnAction(event1);
            }
    }




    public void control_cell(int counter,Button input) 
    {
    	
    	if(counter%2==0)
    		input.setStyle("-fx-background-color: white; ");
    	else
    		input.setStyle("-fx-background-color: black");
    }
    public void clear()
    {
    	
    	but11.setStyle("-fx-background-color: white");
    	but12.setStyle("-fx-background-color: white");
    	but13.setStyle("-fx-background-color: white");
    	but21.setStyle("-fx-background-color: white");
    	but22.setStyle("-fx-background-color: white");
    	but23.setStyle("-fx-background-color: white");
    	but31.setStyle("-fx-background-color: white");
    	but32.setStyle("-fx-background-color: white");
    	but33.setStyle("-fx-background-color: white");

    }
    
    
    
    
    
    
    
    
    
    

}
