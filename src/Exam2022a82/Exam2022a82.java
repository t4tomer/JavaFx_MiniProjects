package Exam2022a82;

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

public class Exam2022a82 {

    List <Button> buttons_list=new ArrayList<Button>();
    String str_random_number;
    Button b;
    int random_number;
    int i;int j;
    int sum;
    int n_cards;// count the number of chosen cards
    int counter;// count the current number of cards

    @FXML
    private GridPane GridPane1;

    @FXML
    private Button clear;
    
    @FXML
    private TextField TextField;

    @FXML
    void clear_pressed(ActionEvent event) {
        // sum =0; 
        GridPane1.getChildren().clear();//clear the gridpane
        TextField.setText("");//clear the textfield from the old game  
        for(i=0;i<5;i++)
           for( j=0;j<5; j++)
           {
                random_number=getRandomNumber();//rand number fom 0 to 400 
                if(random_number!=0)
                    n_cards++;
                String str_random_number=Integer.toString(random_number);
                // String str_random_number=Integer.toString(random_number);

                Button b=new Button(str_random_number );
                GridPane1.add(b, i, j);//add new button to gridpane
                EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() // what happnes when you press a button 
                {
                    public void handle(ActionEvent event1)
                    {   
                        System.out.println("butten value:"+b.getText());                     
                        if(Integer.parseInt(b.getText())==0)
                        {                    
                            TextField.setText("Game Over,you pressed zero!");
                        }
                        else
                        {
                            counter++;
                            sum=sum+Integer.parseInt(b.getText());
                            TextField.setText("Sum:"+sum);
                        }
                        System.out.println("current number of cards:"+counter);
                        System.out.println("total number of cards:"+n_cards);
                        if(counter==n_cards)// if current number of chosen cards equal to the non zero cards
                        {
                            TextField.setText(" you won the game ,your Sum:"+sum);
                            GridPane1.getChildren().clear();//clear the gridpane

                        }
                        b.setDisable(true);//freeze button after pressing it
                    }
                }; 
                b.setOnAction(event1);    
           }
    }
       
    public  int getRandomNumber(){//get random number:0,100,200,300,400
        
        int[] theNumbers = new int[5];
        int num=0;
        for(int i=0;i<theNumbers.length;i++)
        {
            theNumbers[i]=num;
            num=num+100;
        }
        Random random = new Random();

        return theNumbers[random.nextInt(5)];
    }

}
