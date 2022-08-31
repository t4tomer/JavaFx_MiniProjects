package Exam2022a82;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
public class NewButton extends Exam2022a82  {
    
    String str;
    int i;
    int j;
    public  NewButton(int i, int j){
        this.i=i;
        this.j=j;

    }

    @FXML
    void buttonPressed(ActionEvent event) {
        System.out.println("pressed:"+i+","+j);
    }

    

    void test1() { System.out.println("test pressed:"+i+","+j );}



}
