package Quize;

import java.io.FileNotFoundException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;




import javafx.scene.paint.Color; 


public class quize_controller1 extends read_file {
	private int counter=5; // used to skip every 5 lines when Next Question is pressed
	
	private int grade=0;
	
	read_file r1=new read_file();

	int arr[]=r1.Random_Line_Numbers();

    @FXML
    private Label Label; // label that is used to print the questions 
    
    @FXML
    private Label Label1; // label that is used to print messege if the answer is right or false

    @FXML
    private Label Label2; // label that is used to print the final score
    
    @FXML
	protected Button button_A;  
    
    @FXML
    private Button button_B;

    @FXML
    private Button button_C;

    @FXML
    private Button button_D;
    
    
    @FXML
    private Button button_NextQuestion;

    @FXML
    private Button button_StartGame;
    
  
    @FXML
    public void initialize() //default state-freeze all the buttons 
    {
    	setButtonDisable(true,true,true,true,true,false);// setButtonDisable( A,B,C,D,NextQuestion,StartGame ) 
    }
    
   @FXML
    
    void StartGame_Pressed(ActionEvent event) throws FileNotFoundException
    {
       	setButtonDisable(false,false,false,false,false,true);//setButtonDisable( A,B,C,D,NextQuestion,StartGame ) ,false -unfreeze,true-freeze
        grade=0;
//    	read_file r1=new read_file();
	      Label2.setText(""); //print blank space when starting new game


        
        
		Label.setText(r1.New_Question(1)); 		//the question 
       button_A.setText(r1.New_Line(arr[0]));	
       button_B.setText(r1.New_Line(arr[1])); 
       button_C.setText(r1.New_Line(arr[2]));	
       button_D.setText(r1.New_Line(arr[3]));

       

    }

    @FXML
    void A_pressed(ActionEvent event) throws FileNotFoundException {
 		read_file r1=new read_file();
    	String true_answer=(r1.New_Line(2)); // the line with the right answer
    	String current_A=(r1.New_Line(arr[0])); // the answer that hold the current answer of button A 
    	
    	String answer=(String) r1.Cheack_Solution(current_A, true_answer); //  Checks if the answer is correct or not 
		Label1.setText(answer); 		//print the answer in label1 
    	if(answer=="Correct Answer") 
	    	{
	  	      Label1.setTextFill(Color.GREEN);
		      grade=grade+20;
	    	}
    	else
    		Label1.setTextFill(Color.RED);
       	setButtonDisable(true,true,true,true,false,true);//setButtonDisable( A,B,C,D,NextQuestion,StartGame ) ,false -unfreeze,true-freeze




    }

    @FXML
    void B_pressed(ActionEvent event) throws FileNotFoundException {
 		read_file r1=new read_file();
    	String true_answer=(r1.New_Line(2)); // the line with the right answer
    	String current_B=(r1.New_Line(arr[1])); // the answer that hold the current answer of button A 

    	String answer=(String) r1.Cheack_Solution(current_B, true_answer); //  Checks if the answer is correct or not 
		Label1.setText(answer); 		//print the answer in label1
    	if(answer=="Correct Answer") 
    	{
  	      Label1.setTextFill(Color.GREEN);
	      grade=grade+20;
    	}
      	else
      		Label1.setTextFill(Color.RED);
       	setButtonDisable(true,true,true,true,false,true);//setButtonDisable( A,B,C,D,NextQuestion,StartGame ) ,false -unfreeze,true-freeze

    }

    @FXML
    void C_pressed(ActionEvent event) throws FileNotFoundException {
    	
 		read_file r1=new read_file();
    	String true_answer=(r1.New_Line(2)); // the line with the right answer
    	String current_C=(r1.New_Line(arr[2])); // the answer that hold the current answer of button A 

    	String answer=(String) r1.Cheack_Solution(current_C, true_answer); //  Checks if the answer is correct or not 
		Label1.setText(answer); 		//print the answer in label1
    	if(answer=="Correct Answer") 
    	{
  	      Label1.setTextFill(Color.GREEN);
	      grade=grade+20;
    	}
      	else
      		Label1.setTextFill(Color.RED);
       	setButtonDisable(true,true,true,true,false,true);//setButtonDisable( A,B,C,D,NextQuestion,StartGame ) ,false -unfreeze,true-freeze


    }

    @FXML
    void D_pressed(ActionEvent event) throws FileNotFoundException {

 		read_file r1=new read_file();
    	String true_answer=(r1.New_Line(2)); // the line with the right answer
    	String current_D=(r1.New_Line(arr[3])); // the answer that hold the current answer of button A 

    	String answer=(String) r1.Cheack_Solution(current_D, true_answer); //  Checks if the answer is correct or not 
		Label1.setText(answer); 		//print the answer in label1
    	if(answer=="Correct Answer") 
    	{
  	      Label1.setTextFill(Color.GREEN);
	      grade=grade+20;
    	}
      	else
      		Label1.setTextFill(Color.RED);

       	setButtonDisable(true,true,true,true,false,true);//setButtonDisable( A,B,C,D,NextQuestion,StartGame ) ,false -unfreeze,true-freeze



    }
    @FXML
    void NextQuestion_pressed(ActionEvent event) throws FileNotFoundException {

       	setButtonDisable(false,false,false,false,false,true);//setButtonDisable( A,B,C,D,NextQuestion,StartGame ) ,false -unfreeze,true-freeze

    	read_file r1=new read_file();
		Label1.setText("waitng for player to press answer"); 	
	     Label1.setTextFill(Color.BLUE);

        
		Label.setText(r1.New_Question(1+counter)); 		//the question 
				
       button_A.setText(r1.New_Line(arr[0]+counter));	
       button_B.setText(r1.New_Line(arr[1]+counter)); 
       button_C.setText(r1.New_Line(arr[2]+counter));	
       button_D.setText(r1.New_Line(arr[3]+counter));
       counter=counter+5;
       
       
       if(25<counter)
       {
   			Label.setText("the game is finished ,press StartGame button to play again."); 		//print the answer in label
   			Label1.setText("hope you enjoyd the game");
   			Label2.setText("your Score:"+grade); //print the answer in score
   			
          	setButtonDisable(true,true,true,true,true,false);//setButtonDisable( A,B,C,D,NextQuestion,StartGame ) ,false -unfreeze,true-freeze
          	counter=5;

       }
    	   
        
        
        
    }

 
    
    private void setButtonDisable(boolean a,boolean b,boolean c,boolean d,boolean next_q,boolean start_g ) {
    	button_A.setDisable(a);
    	button_B.setDisable(b);
    	button_C.setDisable(c);
    	button_D.setDisable(d);
    	button_NextQuestion.setDisable(next_q);
    	button_StartGame.setDisable(start_g);
    	
    }
    
    
    

    
    

	
	


}
