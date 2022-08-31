package Exam2021b98;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.scene.control.TextField;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class Exam2021b98 {

    ArrayList<Button> arr_but=new ArrayList<Button>();

    String str_random_number;
    Button b;
    int i;int j;
    int ctr=1;//counter to print on the buttons from 1 to 25 
    int ctr2=0;//counter that counts the clicks
    int right_answers=0;// counter that counts the right answers 
    int x=-1;// save the value of first button that was clicked
    int y=-1;// save the value of second button that was clicked
    int z=-1;// save the value of third button that was clicked

    @FXML
    private Button FinishButt;

    @FXML
    private GridPane GridPane1;

    
    @FXML
    private Button clear;
    
    @FXML
    private TextField TextField1;

    @FXML
    void FinishPressed(ActionEvent event) {
        FinishGame();
    }

    @FXML
    void clear_pressed(ActionEvent event) {
        // sum =0; 
        ctr=1;
        GridPane1.getChildren().clear();//clear the gridpane
        TextField1.setText("");//clear the textfield from the old game  
        for(i=0;i<5;i++)
           for( j=0;j<5; j++)
           {
                
                String str_num=Integer.toString(ctr);
                ctr=ctr+1;
                Button b=new Button(str_num );
                arr_but.add(b);

                GridPane1.add(b, j, i);//add new button to gridpane
                EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() // what happnes when you press a button 
                {
                    public void handle(ActionEvent event1)
                    {   
                        System.out.println("x:"+x);
                        System.out.println("y:"+y);
                        System.out.println("z:"+z);
                        ctr2++;                    
                        System.out.println("button:"+b.getText());
                        if(ctr2==1)
                            x=Integer.parseInt(b.getText());
                        if(ctr2==2)
                            y=Integer.parseInt(b.getText());
                        if(ctr2==3)
                            z=Integer.parseInt(b.getText());
                        if(x!=-1 && y==-1 &&  z==-1)
                            TextField1.setText("");//reset the error text field

                        if(x!=-1 && y!=-1 &&  z!=-1 && x+y==z )// if all the 3 buttens were pressed 
                        {
                                System.out.println("TEST");
                                arr_but.get(x-1).setDisable(true);
                                arr_but.get(y-1).setDisable(true);
                                arr_but.get(z-1).setDisable(true);
                                right_answers++;
                                ctr2=0;
                                x=-1;
                                y=-1;
                                z=-1;                       
                        }
                        if(x!=-1 && y!=-1 &&  z!=-1 && x+y!=z )
                        {
                            TextField1.setText("error");
                            ctr2=0;
                            x=-1;
                            y=-1;
                            z=-1;                       

                        }
                    }
                }; 
                b.setOnAction(event1);    
           }
    }

    public void FinishGame(){
        for(int i=0;i<arr_but.size();i++)//freez all buttons
            arr_but.get(i).setDisable(true);
        TextField1.setText("the right answers are: "+right_answers);//print the right answers

    }
       


}
